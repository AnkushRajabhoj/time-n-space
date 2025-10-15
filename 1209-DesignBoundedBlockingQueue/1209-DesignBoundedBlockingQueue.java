// Last updated: 15/10/2025, 05:57:23
class BoundedBlockingQueue {

    Queue<Integer> queue;
    int capacity;
    Lock lock = new ReentrantLock();
    Condition notEmpty = lock.newCondition();
    Condition notFull = lock.newCondition();

    public BoundedBlockingQueue(int capacity) {
        this.capacity = capacity;
        queue = new ArrayDeque<>(capacity);
    }
    
    public void enqueue(int element) throws InterruptedException {
        lock.lock();
        try {
            while(queue.size() == capacity) {
                notFull.await();
            }
            queue.add(element);
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }
    
    public int dequeue() throws InterruptedException {
        lock.lock();
        try {
            while(queue.size() == 0) {
                notEmpty.await();
            }
            int element = queue.remove();
            notFull.signal();
            return element;
        } finally {
            lock.unlock();
        }
    }
    
    public int size() {
        return queue.size();
    }
}