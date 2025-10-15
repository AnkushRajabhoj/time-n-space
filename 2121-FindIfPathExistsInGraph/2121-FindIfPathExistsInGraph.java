// Last updated: 15/10/2025, 05:56:59
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        DSU dsu = new DSU(n);

        for(int[] edge: edges) {
            dsu.union(edge[0], edge[1]);
        }

        return dsu.connected(source, destination);
    }



}

class DSU {
    int[] parent;
    int[] size;

    DSU(int n) {
        parent = new int[n];
        size = new int[n];

        for(int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    int find(int x) {
        if(parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    boolean union(int a, int b) {
        int p1 = find(a);
        int p2 = find(b);

        if (p1 == p2) {
            return false;
        }

        if (size[p1] >= size[p2]) {
            size[p1] += size[p2];
            parent[p2] = p1;
        } else {
            size[p2] += size[p2];
            parent[p1] = p2;
        }
        return true;
    }

    boolean connected(int a, int b) {
        return find(a) == find(b);
    }
}