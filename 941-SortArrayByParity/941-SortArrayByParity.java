// Last updated: 15/10/2025, 05:57:42
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int h = nums.length-1;

        while(l <= h) {
            if(nums[l]%2 == 0) {
                l++;
            } else if(nums[h]%2 == 1) {
                h--;
            } else {
                int temp = nums[l];
                nums[l++] = nums[h];
                nums[h--] = temp;
            }
        }
        return nums;
    }
}