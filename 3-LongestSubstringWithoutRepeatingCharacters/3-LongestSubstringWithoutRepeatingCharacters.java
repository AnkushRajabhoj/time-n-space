// Last updated: 15/10/2025, 06:03:15
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Window

        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int current = 0;
        int p = 0;
        for(int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            while(set.contains(c)) {
                set.remove(s.charAt(p++));
                current--;
            }
            set.add(c);
            current++;
            if (current > max) max = current;
        }
        return max;
    }
}