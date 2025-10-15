// Last updated: 15/10/2025, 06:02:24
class Solution {
    public int rob(int[] nums) {
        int m = nums[0];
        for(int i = 2; i < nums.length; i++) {
            nums[i] += m;
            m = Math.max(m,nums[i-1]);
        }
        m = Math.max(m,nums[nums.length-1]);
        return m;
    }
}