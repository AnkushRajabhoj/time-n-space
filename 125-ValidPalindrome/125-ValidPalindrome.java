// Last updated: 15/10/2025, 06:02:34
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int l = 0;
        int h = s.length()-1;

        while(l <= h) {
            if(s.charAt(l) != s.charAt(h)) return false;
            l++;
            h--;
        }
        return true;
    }
}