// Last updated: 15/10/2025, 05:56:50
class Solution {
    public int maxSum(int[] nums) {
        int maxSum = -1;
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for(int num : nums) {
            int n = num;
            int maxDigit = 0;
            while(num != 0) {
                int digit = num%10;
                num = num/10;
                maxDigit = Math.max(maxDigit, digit);
            }
            PriorityQueue<Integer> q = map
            .computeIfAbsent(maxDigit, k -> new PriorityQueue<>());
            q.add(n);
            if (q.size() > 2) {
                q.poll();
            }
        }

        for(Map.Entry<Integer, PriorityQueue<Integer>> entry: map.entrySet()) {
            PriorityQueue<Integer> q = entry.getValue();
            if(q.size() == 2) {
                maxSum = Math.max(q.poll()+q.poll(), maxSum);
            }
        }
        return maxSum;
        
    }
}