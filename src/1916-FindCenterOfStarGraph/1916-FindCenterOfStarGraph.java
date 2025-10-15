// Last updated: 15/10/2025, 05:57:00
class Solution {
    public int findCenter(int[][] edges) {

        
        return edges[0][0] == edges[1][0] 
            || edges[0][0] == edges[1][1] 
            ? edges[0][0]
            : edges[0][1];
        
    }
}