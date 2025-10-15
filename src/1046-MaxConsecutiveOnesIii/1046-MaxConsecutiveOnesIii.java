// Last updated: 15/10/2025, 05:57:36
class Solution {
    public int longestOnes(int[] nums, int k) {

        int i = 0;
        int j = 0;

        while(j < nums.length) {
            if(nums[j] == 0) k--;

            if (k<0) {
                k += 1 - nums[i++];
            }
            j++;
        }
        return j-i;
    }
}