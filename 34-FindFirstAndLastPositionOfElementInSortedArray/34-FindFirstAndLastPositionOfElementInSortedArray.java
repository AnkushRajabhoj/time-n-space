// Last updated: 15/10/2025, 06:02:56
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        int l = 0;
        int h = nums.length-1;

        while(l <= h) {
            int m = l + (h -l)/2;
            int x = nums[m];
            if(x == target) {
                result[0] = m;
                h = m-1;
            } else if(x < target) {
                l = m+1;
            } else {
                h = m-1;
            }
        }

        if (result[0] < 0) {
            return result;
        } 

        l = result[0];
        h = nums.length-1;

        while(l <= h) {
            int m = l + (h -l)/2;
            int x = nums[m];
            if(x == target) {
                result[1] = m;
                l = m+1;
            } else if(x < target) {
                l = m+1;
            } else {
                h = m-1;
            }
        }
        return result;
    }
}