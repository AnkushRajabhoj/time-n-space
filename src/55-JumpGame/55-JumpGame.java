// Last updated: 15/10/2025, 06:02:51
class Solution {
    public boolean canJump(int[] nums) {
        int destination = nums.length -1;
        int reachable = 0;

        for(int i = 0; i < destination && i <= reachable; i++) {
            reachable = Math.max(reachable, i + nums[i]);
        }

        return reachable >= destination;
    }
}