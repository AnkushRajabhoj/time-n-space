// Last updated: 15/10/2025, 06:03:04
class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(list, sb, n, 0, 0);
        return list;
    }

    void helper(List<String> list, StringBuilder sb, int max, int open, int close) {
        if (sb.length() == 2*max) {
            list.add(sb.toString());
            return;
        }
         if (open < max) {
            helper(list,sb.append('('), max, open+1, close);
            sb.deleteCharAt(sb.length()-1);
         }

         if (close < open) {
            helper(list,sb.append(')'), max, open, close+1);
            sb.deleteCharAt(sb.length()-1);
         }
    }

}