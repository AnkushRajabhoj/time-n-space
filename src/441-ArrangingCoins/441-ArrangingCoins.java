// Last updated: 15/10/2025, 05:58:35
class Solution {
    public int arrangeCoins(int n) {
        long l = 0;
        long h = n;
        while (l <= h) {
            long mid = l + (h-l)/2;
            long r = mid*(mid + 1)/2;

            if (r == n) {
                return (int)mid;
            } else if (r < n) {
                l = mid+1;
            } else {
                h = mid-1;
            }
        }
        return (int) h;
    }
}