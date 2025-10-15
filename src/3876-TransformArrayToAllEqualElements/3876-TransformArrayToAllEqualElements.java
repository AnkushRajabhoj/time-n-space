// Last updated: 15/10/2025, 05:56:45
class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        int[] nums1 = new int[nums.length];
         System.arraycopy(nums, 0, nums1, 0, nums.length);
        int[] nums2 = new int[nums.length];
        System.arraycopy(nums, 0, nums2, 0, nums.length);
        int k1 = k;
        int k2 = k;

        for(int i = 0; i < nums.length-1; i++) {

            if (nums1[i] == -1) {
                nums1[i] = 1;
                 nums1[i+1] *= -1;
                k1--;
            }
            if (nums2[i] == 1) {
                nums2[i] = -1;
                nums2[i+1] *= -1;
                k2--;
            }
            
        }

        return (nums1[nums.length-1] == 1 && k1 >= 0) || (nums2[nums.length-1] == -1 && k2 >= 0);
        
    }
}