// Last updated: 23/10/2025, 23:23:53
class LRUCache {

    LinkedHashMap<Integer, Integer> cache; 
    int size;

    public LRUCache(int capacity) {
        cache = new LinkedHashMap<>(capacity+1);
        size = capacity;
    }
    
    public int get(int key) {
        var val = cache.remove(key);
        if (val != null) {
            put(key, val);
            return val;
        }
        return  -1;
    }
    
    public void put(int key, int value) {
        cache.remove(key);
        cache.put(key, value);
        if(cache.size() > size) {
            cache.pollFirstEntry();
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */