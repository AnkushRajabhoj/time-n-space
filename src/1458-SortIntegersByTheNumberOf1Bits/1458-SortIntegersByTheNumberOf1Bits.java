// Last updated: 15/10/2025, 05:57:12
class Solution {
    public int[] sortByBits(int[] arr) {
        Comparator<Integer> comparator = Comparator
        .comparingInt(this::bitCount)
        .thenComparingInt(Integer::valueOf);
        
        return Arrays.stream(arr).boxed()
            .sorted(comparator)
            .mapToInt(Integer::intValue)
            .toArray();
    }

    int bitCount(int num) {
        int count = 0;
        for(int i = 0; i < 32; i++) {
            if ((num & (1<<i)) != 0) {
                count++;
            }
        }
        return count;
    }
}