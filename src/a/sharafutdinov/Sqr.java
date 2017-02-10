package a.sharafutdinov;

/**
 * Created by innopolis on 10.02.17.
 */
public class Sqr implements Runnable{
    private final int sqr[];
    private final Consumer consumer[];

    public Sqr(int sqr[], Consumer consumer[]) {
        this.sqr = sqr;
        this.consumer = consumer;

    }

    @Override
    public void run() {
        for (int sqr: sqr) {
            int  x = sqr^2;
            for (Consumer consumer: consumer) {
                consumer.inquiry(0, sqr, 0);
            }
        }
    }
}
