// Last updated: 15/10/2025, 06:03:14
class Solution {
    public String convert(String s, int numRows) {
        if(numRows== 1) return s;

        StringBuilder sb = new StringBuilder();

        int carCountPerSec = 2*numRows - 2;

        for(int i = 0; i < numRows; i++) {
            int index = i;
            int secondIndex = carCountPerSec - i;
            while(index < s.length()) {
                sb.append(s.charAt(index));
                if (i != 0 && i != numRows-1) {
                    if(secondIndex < s.length())
                    sb.append(s.charAt(secondIndex));
                }
                index += carCountPerSec;
                secondIndex += carCountPerSec;
            }
        }
        return sb.toString();
    }
}