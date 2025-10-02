class DiningPhilosophers {
    int diningPhilosophers = 5;
    Semaphore chopsticks[]; 
    Semaphore eatingPhilosophers;

    public DiningPhilosophers() {
        chopsticks = new Semaphore[diningPhilosophers];
        eatingPhilosophers = new Semaphore(1);
        for(int i = 0; i < diningPhilosophers; i++) {
            chopsticks[i] = new Semaphore(1);
        } 
    }

    void pickChopstick(int id, Runnable pick) throws InterruptedException {
        chopsticks[id].acquire();
        pick.run();
    }
    
    void putChopstick(int id, Runnable put) throws InterruptedException {
        put.run();
        chopsticks[id].release();
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {

        int left = philosopher;
        int right = (philosopher+4)%diningPhilosophers;

        eatingPhilosophers.acquire();
        pickChopstick(left, pickLeftFork);
        pickChopstick(right, pickRightFork);
        eat.run();
        putChopstick(left, putLeftFork);
        putChopstick(right, putRightFork);
        eatingPhilosophers.release();
    }
}