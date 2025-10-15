// Last updated: 15/10/2025, 05:57:15
class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        
        for(int num: nums) {
            if ((num>=10 && num <100)
            ||(num >= 1000 && num < 10000)
            ||(num >= 100000 && num < 1000000)
            ||(num >= 10000000 && num < 100000000)
            ||(num >= 1000000000)) {
                c++;
                System.out.println(num);
            }
        }
        return c;
    }
}