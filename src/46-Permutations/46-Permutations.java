// Last updated: 15/10/2025, 06:02:53
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    Set<Integer> set = new LinkedHashSet<>();
    
    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums);
        return result;
        
    }

    void backtrack(int[] nums) {
        if (set.size() == nums.length) {
            result.add(new ArrayList<>(set));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                backtrack(nums);
                set.remove(nums[i]);
            }
        }
    }
}