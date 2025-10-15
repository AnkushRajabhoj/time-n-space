// Last updated: 15/10/2025, 05:58:23
class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        boolean isNegative = false;
        if (num < 0) {
            num *=-1;
            isNegative = true;
        }
        while(num != 0) {
            int r = num % 7;
            num = num/7;
            sb.append(r);
        }
        if (isNegative) sb.append('-');
        sb.reverse();
        return sb.toString();
    }
}