// Last updated: 15/10/2025, 05:59:07
class Solution {
    public int[] countBits(int n) {

        int[] r = new int[n+1];
        int k = 0;
        while(k < n) {
            r[++k] = r[k/2]+ k % 2;
        }
        return r;
        
    }
}