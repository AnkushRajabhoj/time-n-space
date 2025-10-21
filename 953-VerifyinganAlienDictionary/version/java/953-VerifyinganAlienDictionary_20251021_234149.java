// Last updated: 21/10/2025, 23:41:49
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        var rankMap = new HashMap<Character, Integer>();

        int rank = 0;
        for(char ch:order.toCharArray()) {
            rankMap.put(ch, rank++);
        }

        for(int i = 0; i < words.length; i++) {
            for(int j = i+1; j < words.length; j++) {
                String low = words[i];
                String high = words[j];

                int minLength = Math.min(low.length(), high.length());
                int pos = 0;
                while (pos < minLength && low.charAt(pos) == high.charAt(pos)) {
                    pos++;
                }
                if (pos < minLength) {
                    if(rankMap.get(low.charAt(pos)) > rankMap.get(high.charAt(pos))) {
                        return false;
                    }
                } else {
                    if(low.length() > high.length()){
                        return false;
                    }
                }

            }
        }
        return true;
    }
}