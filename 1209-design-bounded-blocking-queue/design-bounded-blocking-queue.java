class BoundedBlockingQueue {

    BlockingQueue<Integer> queue;

    public BoundedBlockingQueue(int capacity) {
        queue = new ArrayBlockingQueue<>(capacity);
    }
    
    public void enqueue(int element) throws InterruptedException {
        queue.put(element);
    }
    
    public int dequeue() throws InterruptedException {
        return queue.take();
    }
    
    public int size() {
        return queue.size();
    }
}