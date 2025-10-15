// Last updated: 15/10/2025, 05:58:19
class Solution {
    public int findCircleNum(int[][] isConnected) {

        int component = 0;
        boolean[] visited = new boolean[isConnected.length];

        for(int i = 0; i < isConnected.length; i++) { 
            if (!visited[i]) {
                component++;
                dfs(i, isConnected, visited);
            }
        }

        return component;
    }

    void dfs(int node, int[][] isConnected,  boolean[] visited) {
        visited[node] = true;
        for(int i = 0; i < isConnected.length; i++) {
            if (isConnected[i][node] != 0 && !visited[i]) {
                dfs(i, isConnected, visited);
            }
        }
    }
}