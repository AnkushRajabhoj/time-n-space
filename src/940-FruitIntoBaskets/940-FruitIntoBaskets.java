// Last updated: 15/10/2025, 05:57:49
class Solution {
    public int totalFruit(int[] fruits) {
       int maxSize = 0;
        int left = 0;
        // Type -> Count
        Map<Integer, Integer> fruitsMap = new HashMap<>();
        for(int i = 0; i < fruits.length; i++) {
            fruitsMap.put(fruits[i], fruitsMap.getOrDefault(fruits[i], 0)+1);
            while(fruitsMap.size() > 2) {
                int count = fruitsMap.get(fruits[left])-1;
                if(count == 0) {
                    fruitsMap.remove(fruits[left]);
                } else {
                    fruitsMap.put(fruits[left], count);
                }
                left++;
            }
            maxSize = Math.max(maxSize, i-left+1);
        }
        return maxSize;  
    }  
}