// Last updated: 21/10/2025, 23:49:06
class Solution {
    public int[] sortedSquares(int[] nums) {
        int sorted[] = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int pos = nums.length-1;
        while(left <= right) {
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];

            if(rightSquare >= leftSquare) {
                sorted[pos--] = rightSquare;
                right--;
            } else {
                sorted[pos--] = leftSquare;
                left++;
            }
        }
        return sorted;
    }
}