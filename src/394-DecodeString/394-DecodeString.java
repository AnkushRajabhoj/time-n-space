// Last updated: 15/10/2025, 05:58:47
class Solution {
    public String decodeString(String s) {
        ArrayDeque<Integer> countStack = new ArrayDeque<>();
        ArrayDeque<StringBuilder> stringStack = new ArrayDeque<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for(char ch: s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k*10 +ch -'0';
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder decodedString = stringStack.pop();
                int count = countStack.pop();

                for(int i = 0; i < count; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }
}