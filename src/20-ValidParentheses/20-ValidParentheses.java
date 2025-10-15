// Last updated: 15/10/2025, 06:03:06
class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for(char ch: s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[' ) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char pop = stack.pop();

                if ((ch == ')' && pop != '(')
                ||(ch == '}' && pop != '{')
                || (ch == ']' && pop != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
        
    }
}