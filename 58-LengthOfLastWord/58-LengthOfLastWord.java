// Last updated: 15/10/2025, 06:02:47
class Solution {
    public int lengthOfLastWord(String s) {

        int i = s.length()-1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        int c = 0;
        for(; i >= 0 && s.charAt(i) != ' '; i--) {
            c++;
        }
        return c;
    }
}