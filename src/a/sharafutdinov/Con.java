package a.sharafutdinov;

/**
 * Created by innopolis on 10.02.17.
 */
public class Con implements Runnable {
    private final int con[];
    private final Consumer consumer[];

    public Con(int con[], Consumer consumer[]) {
        this.con = con;
        this.consumer=consumer;
    }

    @Override
    public void run() {
        for(int con: con) {
            for(Consumer consumer: consumer) {
                consumer.inquiry(0, 0, con);
            }
        }
    }
}
