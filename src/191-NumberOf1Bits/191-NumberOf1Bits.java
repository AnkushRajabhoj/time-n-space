// Last updated: 15/10/2025, 06:02:26
class Solution {
    public int hammingWeight(int n) {
        int c = 0;
        while(n != 0) {
            c++;
            n = n&(n-1);
        }
        return c;
    }
}