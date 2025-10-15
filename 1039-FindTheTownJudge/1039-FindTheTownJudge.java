// Last updated: 15/10/2025, 05:57:37
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustMe = new int[n];
        int[] trustOther = new int[n];
        for(int[] t: trust) {
            ++trustMe[t[1]-1]; 
            ++trustOther[t[0]-1];
        }

        for(int i = 0; i < n; i++) {
            if(trustMe[i] == n-1 && trustOther[i] == 0) {
            return i+1;
           }
        }
        return -1;
    }
}