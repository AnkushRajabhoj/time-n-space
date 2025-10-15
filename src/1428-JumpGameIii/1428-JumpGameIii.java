// Last updated: 15/10/2025, 05:57:13
class Solution {
    public boolean canReach(int[] arr, int start) {
        if (start < 0 || start >= arr.length) {
            return false;
        }
        if(arr[start] <= 0 ) {
            return arr[start] == 0;
        }
        arr[start] *= -1;
        return canReach(arr, start + arr[start]) || canReach(arr, start - arr[start]);
    }
}