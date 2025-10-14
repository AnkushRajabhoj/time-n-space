class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] result = new int[nums.length];
        int index = right;
        while(left <= right) {
            var num = 0;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                num = nums[right--];
            } else {
                num = nums[left++];
            }
            result[index--] = num * num;
        }
        System.gc();
        return result;
        
    }
}