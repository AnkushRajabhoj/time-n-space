// Last updated: 15/10/2025, 06:02:29
class Solution {
    public int singleNumber(int[] nums) {
        
        int single = 0;

        for(int num: nums) {
            single ^= num;
        }
        return single;
    }
}