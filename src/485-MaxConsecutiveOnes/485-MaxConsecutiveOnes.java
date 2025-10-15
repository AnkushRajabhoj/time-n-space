// Last updated: 15/10/2025, 05:58:30
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int c = 0;
        for(int i: nums) {
            if (i == 1) {
                c++;
            } else if (i == 0) {
                max = Math.max(c,max);
                c = 0;
            }
            
        }
        max = Math.max(c,max);
        return max;
    }
}