// Last updated: 15/10/2025, 05:58:40
class Solution {
    public int characterReplacement(String s, int k) {

        int maxFrequency = 0;
        int start = 0;
        int longestSubstringLength = 0;

        int[] frequencyMap = new int[26];

        for(int end = 0; end < s.length(); end ++) {
            int currentChar = s.charAt(end) - 'A';
            frequencyMap[currentChar]++;
            maxFrequency = Math.max(maxFrequency, frequencyMap[currentChar]);


            int windowSize = end - start + 1;

            boolean isValidWindow = windowSize - maxFrequency <= k;

            if (!isValidWindow) {
                int outingChar = s.charAt(start) - 'A';
                frequencyMap[outingChar]--;
                start++;
            } else {
                longestSubstringLength = Math.max(longestSubstringLength, windowSize);
            }
        }

        return longestSubstringLength;

        
    }
}