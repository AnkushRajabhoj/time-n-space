// Last updated: 15/10/2025, 05:57:41
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int o = 1;
        int e = 0;
        int l = nums.length;

        while(o < l && e<l) {
            while(o < l && nums[o]%2 == 1)o+=2;
            while(e < l && nums[e]%2 == 0)e+=2;
            if (o < l && e < l){
                int temp = nums[o];
                nums[o] = nums[e];
                nums[e] = temp;
            }
        }
        return nums;
    }
}