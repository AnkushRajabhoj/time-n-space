// Last updated: 15/10/2025, 06:03:01
class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 1;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[idx++] = nums[i];
            } 
        }
        return idx;
    }
}