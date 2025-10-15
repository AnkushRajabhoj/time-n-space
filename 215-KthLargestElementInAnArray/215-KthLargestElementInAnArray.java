// Last updated: 15/10/2025, 05:59:26
class Solution {
    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(Arrays.stream(nums).boxed().toList(), k);
    }

    public int findKthLargest(List<Integer> nums, int k) {
        List<Integer> less = new ArrayList<>();
        List<Integer> more = new ArrayList<>();
        int count = 0;
        
        for(int num: nums) {
            if (nums.get(0) == num) {
                count++;
            } else if (num < nums.get(0)) {
                less.add(num);
            } else {
                more.add(num);
            }
        }

        if (k <= more.size()) {
            return findKthLargest(more, k);
        } else if (k > more.size() + count) {
            return findKthLargest(less, k - count -  more.size());
        }
        return nums.get(0);
        
    }
}