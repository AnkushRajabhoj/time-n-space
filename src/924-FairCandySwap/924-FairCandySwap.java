// Last updated: 15/10/2025, 05:57:50
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> setA = Arrays.stream(aliceSizes).boxed().collect(Collectors.toSet());
        int diff = Arrays.stream(aliceSizes).sum() - Arrays.stream(bobSizes).sum();
        diff /= 2;

        
        for(int bSize: bobSizes) {
            int desiredASize = diff + bSize;
            if(setA.contains(desiredASize)) {
                return new int[]{desiredASize, bSize};
            }
        }
        return new int[]{};
    }
}