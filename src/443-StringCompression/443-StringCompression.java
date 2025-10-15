// Last updated: 15/10/2025, 05:58:33
class Solution {
    public int compress(char[] chars) {

        StringBuilder sb = new StringBuilder(); 

        int l = 0;

        while (l < chars.length) {
            char c = chars[l];
            int count = 0;
            while(l < chars.length && c == chars[l]) {
                count++;
                l++;
                System.out.println(count);
            }
            sb.append(c);
            if (count > 1) {
                sb.append(count);
                System.out.println(sb);
            }
        }

        for(int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
        
    }
}