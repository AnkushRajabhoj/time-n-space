// Last updated: 15/10/2025, 05:59:11
class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> sub = new ArrayList<>();
        sub.add(nums[0]);

        for(int i = 0; i< nums.length; i++) {
            int num = nums[i];
            if (num > sub.getLast()) {
                sub.add(num);
            } else {
                int k = Collections.binarySearch(sub, num);
                if (k < 0) k = -(k +1);
                sub.set(k, num);
            }
        }
        return sub.size();
    }
}