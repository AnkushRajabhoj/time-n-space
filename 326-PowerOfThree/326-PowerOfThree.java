// Last updated: 15/10/2025, 05:59:10
class Solution {
    public boolean isPowerOfThree(int n) {
        return Math.log10(n)/Math.log10(3) % 1 == 0;
    }
}