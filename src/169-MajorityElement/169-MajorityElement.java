// Last updated: 15/10/2025, 06:02:27
class Solution {
    public int majorityElement(int[] nums) {
        int me = 0;
        int mc = 0;

        for(int i = 0; i < nums.length; i++){
            if (mc == 0) {
                me = nums[i];
            }
            if(nums[i] == me) {
                mc++;
            } else {
                mc--;
            }
        }
        return me;
        
    }
}