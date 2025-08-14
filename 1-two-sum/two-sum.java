// Solution 1: 
//  num + num` = targer
// for each num find the index of num` if present
// Space = O(nums)
// Time = O(nums)


// Solution 2:
// If space is constraint
// then sort -> two pointer 
// low and high -> move towards centre -> find the target sum 
// for any 3 and 3+ some we will use this method

class Solution {
    public int[] twoSum(int[] nums, int target) {
      // { num : index }
      var indexMap = new HashMap<Integer, Integer>();

      for(var i = 0; i < nums.length; i++) {
        // num` = target - num
        var numComplement = target - nums[i];

        if (indexMap.containsKey(numComplement)) {
          // found
          return new int[]{indexMap.get(numComplement), i};
        }

        indexMap.put(nums[i], i);
      }
      // Not found
      return new int[]{-1,-1};
    }
}