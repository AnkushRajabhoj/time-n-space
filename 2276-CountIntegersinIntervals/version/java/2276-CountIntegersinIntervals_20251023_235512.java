// Last updated: 23/10/2025, 23:55:12
class CountIntervals {

    TreeMap<Integer, Integer> interval = new TreeMap<>();
    int count = 0;

    public CountIntervals() {
        
    }
    
    public void add(int left, int right) {
        var prev = interval.floorEntry(left);
        var next = interval.higherEntry(left);

        if (prev != null && prev.getValue() >= left) {
            left = prev.getKey();
            right = Math.max(prev.getValue(), right);

            count -= (prev.getValue() - prev.getKey() +1);
            interval.remove(prev.getKey());
        }

        while(next != null && next.getKey() <= right) {
            right = Math.max(next.getValue(), right);
            count -= (next.getValue() - next.getKey() +1);
            interval.remove(next.getKey());
            next = interval.ceilingEntry(left);
        }

        count += (right - left + 1);
        interval.put(left, right);
        
    }
    
    public int count() {
        

        return count;
        
        
    }
}

/**
 * Your CountIntervals object will be instantiated and called as such:
 * CountIntervals obj = new CountIntervals();
 * obj.add(left,right);
 * int param_2 = obj.count();
 */