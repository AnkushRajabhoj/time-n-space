// Last updated: 15/10/2025, 05:57:16
class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie root = new Trie(); 

        for(String product: products) {
            Trie node = root;
            for(char c: product.toCharArray()) {
                node = node.children.computeIfAbsent(c, k -> new Trie());
                node.words.add(product);
                if (node.words.size() > 3)node.words.removeLast();
            }
        }

        List<List<String>> result = new ArrayList<>();

        Trie node = root;
        for(char c: searchWord.toCharArray()) {
            node = node != null ? node.children.get(c) : node;
            List<String> list = new ArrayList<>();
            result.add(list);
            if (node != null) {
                int count = 0;
                for(String word: node.words) {
                    if(count == 3) {
                        break;
                    }
                    list.add(word);
                    count ++;
                }
            }
            
        }

        return result;
        
    }
}

class Trie {
    TreeSet<String> words = new TreeSet<>();
    Map<Character, Trie> children = new HashMap<>();
}