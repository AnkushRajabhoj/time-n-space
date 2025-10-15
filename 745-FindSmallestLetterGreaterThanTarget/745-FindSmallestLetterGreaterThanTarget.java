// Last updated: 15/10/2025, 05:58:09
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length-1;

        while (l <= r) {
            int mid = l + (r-l)/2;
            char mChar = letters[mid];

            if (mChar == target || mChar < target) {
                l = mid + 1;
            } else {
                r = mid-1;
            }
        }
        return l >= letters.length 
            ? letters[0] 
            : letters[l];
    }
}