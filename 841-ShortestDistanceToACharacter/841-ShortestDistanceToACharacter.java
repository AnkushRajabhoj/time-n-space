// Last updated: 15/10/2025, 05:58:04
class Solution {
    public int[] shortestToChar(String s, char c) {
        int b = -1;
        int a = -1;
        int ans[] = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            if(a < i) {
                b = a;
                while(++a < s.length() && s.charAt(a) != c){}
            }
            int min = Integer.MAX_VALUE;
            if (b <= i && b >= 0) {
                min = Math.min(min, i-b);
            }

            if (a >= i && a < s.length()) {
                min = Math.min(min, a - i);
            }
            //System.out.println(a+" "+b+ " " + i +" " +min);
            ans[i] = min;
        }
        
        return ans;
        
    }

}