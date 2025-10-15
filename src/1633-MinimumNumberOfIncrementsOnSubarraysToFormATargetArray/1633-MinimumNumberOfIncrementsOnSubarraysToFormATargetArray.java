// Last updated: 15/10/2025, 05:57:09
class Solution {
    public int minNumberOperations(int[] target) {
        int cost = target[0];
        for(int i = 1; i < target.length; i++) {
            cost += Math.max(0, target[i] - target[i-1]);
        }
        return cost;
    }
}