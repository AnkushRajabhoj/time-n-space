// Last updated: 15/10/2025, 05:58:45
class Solution {
    public int splitArray(int[] nums, int k) {

        int sum = 0;
        int max = 0;
        for(int num: nums) {
            sum += num;
            max = Math.max(max, num);
        }

        int l = max;
        int h = sum;

        int result = -1;

        while(l <= h) {
            int mid = l + (h-l)/2;
            int part = 1;

            sum = 0;
            for(int num: nums) {
                if (sum + num > mid) {
                    part++; 
                    sum = 0;
                }
                sum += num;
            }

            if (part <= k) {
                h = mid - 1;
                result = mid;
            } else {
                l = mid +1;
            }


        }



        return result;
    }
}