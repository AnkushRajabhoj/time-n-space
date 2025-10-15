// Last updated: 15/10/2025, 05:58:56
class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1;
        int h = num;

        while (l <= h) {
            int mid = l + (h -l)/2;
            long square = (1l*mid) * mid;
            //System.out.println(mid + " " + square);
            if (square == num) {
                return true;
            } else if(square < num) {
                l = mid+1;
            } else {
                h = mid - 1;
            }
        }
        return false;
    }
}