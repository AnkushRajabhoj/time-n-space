// Last updated: 15/10/2025, 05:59:06
class MovingAverage {
    int maxSize;
    ArrayDeque<Integer> q;
    int sum = 0;


    public MovingAverage(int size) {
        maxSize = size;
        q = new ArrayDeque<>(size);
    }
    
    public double next(int val) {
        q.addLast(val);
        sum += val;
        if (q.size() >maxSize) {
            sum -= q.removeFirst();
        }
        return ((double)sum)/q.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */