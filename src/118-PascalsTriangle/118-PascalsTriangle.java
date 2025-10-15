// Last updated: 15/10/2025, 06:02:37
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> traingle = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        traingle.add(prev);
        for(int i = 2; i <= numRows; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for(int j = 1; j < prev.size(); j++) {
                current.add(prev.get(j-1)+prev.get(j));
            }
            current.add(1);
            traingle.add(current);
            prev = current;
        }
        return traingle;
        
    }
}