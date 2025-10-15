// Last updated: 15/10/2025, 06:02:52
class Solution {
    public double myPow(double x, int n) {
        return myPow(x,(long)n);
    }
    public double myPow(double x, long n) {
        if (x == 0 || x == 1) {
            return x;
        }
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1.0/myPow(x, -n);
        }

        double result = 1;
        if (n%2 !=0) {
            result *= x;
            n--;
        }
        double temp = myPow(x, n/2);
        result *= temp;
        result *= temp;
        return result;
    }
}