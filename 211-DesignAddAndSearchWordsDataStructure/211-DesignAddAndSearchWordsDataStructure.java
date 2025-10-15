// Last updated: 15/10/2025, 05:59:27
class Trie {
    boolean isWord = false;
    HashMap<Character, Trie> childrens = new HashMap<>();
}
class WordDictionary {

    Trie root;

    public WordDictionary() {
        root = new Trie();
    }
    
    public void addWord(String word) {
        Trie curr = root;
        for(char c: word.toCharArray()) {
            curr = curr.childrens.computeIfAbsent(c, k-> new Trie());
        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        return search(word, root);
    }

    public boolean search(String word, Trie curr) {
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') {
                for(Trie trie: curr.childrens.values()) {
                     if (search(word.substring(i + 1), trie)) {
                        return true;
                     }
                }
                return false;
            } else {
                curr = curr.childrens.get(c);
                if (curr == null) return false;
            }
            
            
        }
        return curr.isWord;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */