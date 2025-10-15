// Last updated: 15/10/2025, 05:56:57
class Solution {
    public boolean canChange(String start, String target) {

        int p1 = 0;
        int p2 = 0;


        while(p1 < start.length() || p2 < target.length()) {
            
            while(p1 < start.length() && start.charAt(p1) == '_')p1++;
            while(p2 < target.length() && target.charAt(p2) == '_')p2++;


            if(p1 == start.length() || p2 == target.length()) {
                return p1 == start.length() && p2 == target.length();
            }

            if (start.charAt(p1) != target.charAt(p2)) return false;

            if (start.charAt(p1) == 'L' && p1 < p2) return false;
            if (start.charAt(p1) == 'R' && p1 > p2) return false;

            p1++;
            p2++;

        }

        return true;



        
    }
}