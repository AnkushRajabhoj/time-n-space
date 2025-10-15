// Last updated: 15/10/2025, 05:58:24
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums2) {
            while(!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        while(!stack.isEmpty()) {
            map.put(stack.pop(),-1);
        }

        for(int i = 0 ; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
        
    }
}