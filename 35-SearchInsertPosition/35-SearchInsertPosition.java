// Last updated: 15/10/2025, 06:02:55
class Solution {
    public int searchInsert(int[] nums, int target) {

        int index = Arrays.binarySearch(nums, target);
        return index >= 0 ? index : -(index+1);
    }
}