package a.sharafutdinov;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Consumer[] consumers = {new Consumer()};
        int i [] = {1,2,3};
        Thread threads[] = new Thread[6];
        threads[0] = new Thread(new Kub(i, consumers));
        threads[1] = new Thread(new Sqr(i, consumers));
        threads[2] = new Thread(new Con(i, consumers));
        threads[3] = new Thread(new Con(i, consumers));
        threads[4] = new Thread(new Con(i, consumers));
        threads[5] = new Thread(new Con(i, consumers));
        for (Thread thread: threads) {
            thread.start();
        }
        for(Thread thread: threads) {
            thread.join();
        }
        System.out.println(consumers[0].getAtomicInt());
    }
}
