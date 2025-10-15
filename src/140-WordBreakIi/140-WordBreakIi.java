// Last updated: 15/10/2025, 06:02:28
class Trie {
    Map<Character, Trie> children = new HashMap<>();
    boolean isWord = false;
}

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
         Trie root = new Trie();
        for(String str: wordDict) {
            Trie curr = root;
            for(char c: str.toCharArray()) {
                curr = curr.children.computeIfAbsent(c, k -> new Trie());
            }
            curr.isWord = true;
        }

        //boolean[] dp = new boolean[s.length()];
        HashMap<Integer, List<String>> dp = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if ( i == 0 || dp.containsKey(i-1)) {
                Trie curr = root;
                
                for(int j = i; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (!curr.children.containsKey(c)) {
                        break;
                    }
                    curr = curr.children.get(c);
                    if (curr.isWord) {
                        var validSentense = dp.computeIfAbsent(j, k -> new ArrayList<>()); 
                        var currentWord = s.substring(i, j+1);
                        if (i == 0) {
                            validSentense.add(currentWord);
                        } else {
                            var validSentenseFromLastIndex = dp.get(i-1);

                            for(String sentense: validSentenseFromLastIndex) {
                                validSentense.add(sentense + " " + currentWord);
                            }
                        }
                    }
                }
            }
        }
        return dp.computeIfAbsent(s.length()-1, k -> new ArrayList<>());
        
    }
}