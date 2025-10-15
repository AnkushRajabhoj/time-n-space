// Last updated: 15/10/2025, 05:59:03
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) +1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++) {
            if(map.getOrDefault(nums2[i], 0) != 0) {
                map.put(nums2[i], map.get(nums2[i]) - 1);
                list.add(nums2[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}