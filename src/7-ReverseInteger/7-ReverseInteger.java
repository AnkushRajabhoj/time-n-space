// Last updated: 15/10/2025, 06:03:13
class Solution {
    public int reverse(int x) {
        int rev = 0;
        int k = x;
        while(x!=0){
            int d = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) 
                return 0;
            rev = rev*10 + d;
            x /= 10;
        }
        return rev;
        
    }
}