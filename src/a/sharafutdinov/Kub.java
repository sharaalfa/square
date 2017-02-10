package a.sharafutdinov;

/**
 * Created by innopolis on 10.02.17.
 */
public class Kub implements Runnable {
    private final int kub[];
    private final Consumer consumer[];

    public Kub(int kub[], Consumer consumer[]) {
        this.kub = kub;
        this.consumer = consumer;

    }

    @Override
    public void run() {
        for (int kub: kub) {
            int  x = kub^3;
            for (Consumer consumer: consumer) {
                consumer.inquiry(kub, 0, 0);
            }
        }
    }
}
