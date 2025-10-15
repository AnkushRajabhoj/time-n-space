// Last updated: 15/10/2025, 05:58:32
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c = 0;
        for(int i = 0; i < s.length; i ++) {
            if(c < g.length && s[i] >= g[c]) {
                c++;
            }
        }
        return c;
    }
}