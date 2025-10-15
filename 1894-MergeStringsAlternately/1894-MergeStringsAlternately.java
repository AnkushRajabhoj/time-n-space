// Last updated: 15/10/2025, 05:57:02
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1 = 0;
        int p2 = 0;

        StringBuilder result = new StringBuilder();
        while(p1 < word1.length() && p2 < word2.length()) {
            result.append(word1.charAt(p1++));
            result.append(word2.charAt(p2++));
        }

        while(p1 < word1.length()) {
            result.append(word1.charAt(p1++));
        }
        while(p2 < word2.length()) {
            result.append(word2.charAt(p2++));
        }

        return result.toString();

    }
}