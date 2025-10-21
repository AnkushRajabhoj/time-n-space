// Last updated: 21/10/2025, 23:08:13
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = 1;
        int c = 0;
        for(; i <= num1.length() && i <= num2.length(); i++) {
            int n1 = num1.charAt(num1.length() - i) - '0';
            int n2 = num2.charAt(num2.length() - i) - '0';
            int sum = n1+n2+c;
            result.append(sum%10);
            c= sum/10;
        }

        for(; i <= num1.length(); i++) {
            int n1 = num1.charAt(num1.length() - i) - '0';
            int sum = n1+c;
            result.append(sum%10);
            c= sum/10;
        }

        for(; i <= num2.length(); i++) {
            int n2 = num2.charAt(num2.length() - i) - '0';
            int sum = n2+c;
            result.append(sum%10);
            c= sum/10;
        }

        if (c != 0) result.append(c);

        return result.reverse().toString();

        
    }
}