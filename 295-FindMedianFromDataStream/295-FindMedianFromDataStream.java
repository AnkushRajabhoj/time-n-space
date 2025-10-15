// Last updated: 15/10/2025, 05:59:13
class MedianFinder {
    // extract min
    PriorityQueue<Integer> secondHalf = new PriorityQueue<>();

    // extract max
    PriorityQueue<Integer> firstHalf = new PriorityQueue<>(Collections.reverseOrder());


    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        firstHalf.add(num);
        secondHalf.add(firstHalf.poll());
        
        if(firstHalf.size() < secondHalf.size()) {
            firstHalf.add(secondHalf.poll());
        }
        
    }
    
    public double findMedian() {
        //System.out.print(firs);
        if(firstHalf.size() == secondHalf.size()) {
            return (firstHalf.peek().doubleValue() + secondHalf.peek().doubleValue())/2.0;
        }
        return firstHalf.peek().doubleValue();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */