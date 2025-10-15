// Last updated: 15/10/2025, 05:58:58
class HitCounter {

    ArrayDeque<Integer> hits = new ArrayDeque<>();

    public HitCounter() {
        
    }

    private void removeStale(int timestamp) {
      while(!hits.isEmpty() && hits.getFirst() <= timestamp - 300) {
        hits.removeFirst();
      }
    }
    
    public void hit(int timestamp) {
      removeStale(timestamp);
      hits.add(timestamp);
    }
    
    public int getHits(int timestamp) {
      removeStale(timestamp);
      return hits.size();
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */