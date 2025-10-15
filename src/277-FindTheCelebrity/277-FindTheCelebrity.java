// Last updated: 15/10/2025, 05:59:17
/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {

    public int findCelebrity(int n) {
        
        int c = 0;

        for(int i = 1; i < n; i++) {
            if(knows(c, i)) {
                c = i;
            }
        }

        for(int i = 0; i < n ; i++) {
            if(c != i && (knows(c, i) || !knows(i,c))) {
                return -1;
            }
        }



        // System.out.println(Arrays.toString(in));
        // System.out.println(Arrays.toString(out));
        return c;
    }
}