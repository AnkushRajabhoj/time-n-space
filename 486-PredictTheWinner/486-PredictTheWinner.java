// Last updated: 15/10/2025, 05:58:25
class Solution {

    // Time complexity = n^2
    // Space complexity = n^2

    HashMap<String, Integer> cache = new HashMap<>();
    public boolean predictTheWinner(int[] nums) {
      int sum = Arrays.stream(nums).sum();
      int maxScoreP1 = maxScore(nums, 0, nums.length-1);
      int maxScoreP2 = sum - maxScoreP1;
      return maxScoreP1 >= maxScoreP2;
    }

    int maxScore(int[]nums, int l, int r) {
      String key = "" + l+ ":" + r;
      if (l > r) {
        // invalid cases
        return 0;
      }
      if (l == r) {
        // small P
        return nums[l];
      }
      
      // memoization
      if (cache.containsKey(key)) {
        return cache.get(key);
      }

      // calculation
      // if left end selected;
      int numLeft = Math.min(maxScore(nums, l+2,r), maxScore(nums, l+1,r-1));
      numLeft += nums[l];

      // if right end selected;
      int numRight = Math.min(maxScore(nums, l+1,r-1), maxScore(nums, l,r-2));
      numRight += nums[r];

      int result =  Math.max(numLeft, numRight);

      // saving result;
      cache.put(key, result);
      return result;
    }
}