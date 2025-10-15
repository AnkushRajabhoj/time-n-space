// Last updated: 15/10/2025, 05:59:22
class Solution {
    public int missingNumber(int[] nums) {
        long number = 0;

        for(int  i = 0; i < nums.length; i++) {
            number -= nums[i];
            number += (nums.length-i);
        }
        return (int)number;
    }
}