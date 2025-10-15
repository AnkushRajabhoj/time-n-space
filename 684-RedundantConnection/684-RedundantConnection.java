// Last updated: 15/10/2025, 05:58:12
class Solution {
    class DS {
        int n;
        int[] parent;
        int[] size;
        public DS(int n) {
            n = n;
            size = new int[n];
            parent = new int[n];

            for(int i =0; i < n; i++) {
                size[i] = 1;
                parent[i] = i;
            }
        }


        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        boolean union(int a, int b) {
            int p1 = find(a);
            int p2 = find(b);

            if (p1 == p2) return false;

            if (size[p1] >= size[p2]) {
                parent[p2] = p1;
                size[p1] += size[p2];
            } else {
                parent[p1] = p2;
                size[p2] += size[p1];
            }
            return true;
        }
    }

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;

        DS dsu = new DS(n);
        for(int[] edge: edges) {
            if(!dsu.union(edge[0]-1, edge[1]-1)) {
                return edge;
            }
        }
        return new int[] {};
    }
}