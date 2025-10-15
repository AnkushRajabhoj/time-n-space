// Last updated: 15/10/2025, 09:06:48
// // Using inbuild method
class Solution {
    public int search(int[] nums, int target) {
        int pos = Arrays.binarySearch(nums, target);

        return pos >= 0 ? pos: -1;        
    }
}