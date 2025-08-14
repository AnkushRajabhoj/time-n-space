// Time complexity = O(nums)
// Space complexity = O(nums)


class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Number -> Index
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int desiredNumber = target - nums[i];

            if (map.containsKey(desiredNumber)) {
                return new int[]{map.get(desiredNumber), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1,-1};
    }
}
