// Last updated: 15/10/2025, 05:57:32
class Solution {
    public int earliestAcq(int[][] logs, int n) {
        DisjointSet set = new DisjointSet(n);
        Arrays.sort(logs, (a,b) -> Integer.compare(a[0], b[0]));

        int count = n;
        for(int[] log: logs) {
            if (!set.isConnected(log[1], log[2])) {
                count--;
                set.union(log[1], log[2]);
                if (count == 1) {
                    return log[0];
                }
            }
        }
        return -1;
    }
}

class DisjointSet {

    int parent[];

    public DisjointSet(int size) {
        parent = new int[size];

        for(int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    int find(int x) {
        if(parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    void union(int a, int b) {
        int aParent = find(a);
        int bParent = find(b);

        if (aParent != bParent) {
            parent[bParent] = aParent;
        }
    }

    boolean isConnected(int a, int b) {
        return find(a) == find(b);
    }
    
}

