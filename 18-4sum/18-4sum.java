// Last updated: 15/10/2025, 06:03:09
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int j = 0; j <nums.length; j++) {
            if (j != 0 && nums[j] == nums[j - 1]) {
                continue;
            }
        for (int i = j+1; i < nums.length; i++) {
            if (i != j+1 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                long sum = 0l + nums[j] + nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    result.add(List.of(nums[j], nums[i], nums[left++], nums[right--]));
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        }
        return result;
    }
}