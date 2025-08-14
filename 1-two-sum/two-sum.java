class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Number -> Index
        var indexMap = new HashMap<Integer, Integer>();

        for(var i = 0; i < nums.length; i++) {
            var desiredNumber = target - nums[i];

            if (indexMap.containsKey(desiredNumber)) {
                return new int[]{indexMap.get(desiredNumber), i};
            }

            indexMap.put(nums[i], i);
        }

        return new int[]{-1,-1};
    }
}