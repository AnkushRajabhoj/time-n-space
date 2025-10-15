// Last updated: 15/10/2025, 05:58:42
class Trie {
    Trie[] children = new Trie[2];
    int num;
}
class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int num: nums) {
            max = Math.max(max, num);
        }

        Trie root = new Trie();
        int L = Integer.toBinaryString(max).length();
        int maxXor = 0;

        for(int num : nums) {
            Trie node = root;
            Trie xorNode = root;
            for(int i = L-1; i >= 0; i--) {
                int bit = (num >> i) & 1;
                int toggledBit = bit ^ 1;

                if (node.children[bit] == null) {
                    node.children[bit] = new Trie();
                }
                node = node.children[bit];

                if (xorNode.children[toggledBit] != null) {
                    xorNode = xorNode.children[toggledBit];
                } else {
                    xorNode = xorNode.children[bit];
                }
            }
            node.num = num;
            maxXor = Math.max(maxXor, num ^ xorNode.num);
        }
        return maxXor;
    }
}