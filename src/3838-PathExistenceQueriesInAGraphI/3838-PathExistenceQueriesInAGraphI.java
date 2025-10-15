// Last updated: 15/10/2025, 05:56:46
class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {

        int group[] = new int[n];

        for(int i = 1; i < n; i++) {
            if(Math.abs(nums[i]-nums[i-1]) <= maxDiff) {
                group[i] = group[i-1];
            } else {
                group[i] = group[i-1] + 1;
            }
        }

        boolean result[] = new boolean[queries.length];
        int i = 0;
        for(int[] query: queries) {
            result[i++] = group[query[0]] == group[query[1]];
        }

        return result;
    }
}