// Last updated: 15/10/2025, 05:56:48
class Solution {
    public boolean isArraySpecial(int[] nums) {
        int remender = nums[0]%2;
        int expectedRemender = 1 - remender;
        for(int i = 1; i <nums.length; i++) {
            remender = nums[i]%2;
            if(remender != expectedRemender) return false;
            expectedRemender = 1 - remender;

        }
        System.gc();
        return true;
    }
}