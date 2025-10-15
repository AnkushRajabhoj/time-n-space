// Last updated: 15/10/2025, 06:02:31
class Trie {
    Map<Character, Trie> children;
    boolean isWord;
    Trie() {
        this.children = new HashMap<>();
    }
}
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // Step 1: create trie
        Trie root = new Trie();
        for(String str: wordDict) {
            Trie curr = root;
            for(char c: str.toCharArray()) {
                curr = curr.children.computeIfAbsent(c, k -> new Trie());
            }
            curr.isWord = true;
        }


        // Step 2

         boolean[] dp = new boolean[s.length()];
        for(int i = 0; i < s.length(); i++) {
            if ( i == 0 || dp[i-1]) {
                Trie curr = root;
                for(int j = i; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (!curr.children.containsKey(c)) {
                        break;
                    }
                    curr = curr.children.get(c);
                    dp[j] |= curr.isWord;
                
                }
            }
        }
        return dp[s.length()-1];
    }
}