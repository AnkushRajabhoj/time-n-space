// Last updated: 15/10/2025, 06:02:57
class Solution {
    public int search(int[] nums, int target) {
        int l = 0; 
        int h = nums.length -1;

        while(l<=h) {
            int mid = l + (h-l)/2;

           int num = (target < nums[0]) == (nums[mid] < nums[0])
                    ? nums[mid]
                    : target < nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            if(num == target) {
                return mid;
            } else if (num < target) {
                l = mid +1;
            } else if(num > target) {
                h = mid-1;
            }
        }
        return -1;
    }
}