package a.sharafutdinov;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by innopolis on 10.02.17.
 */
public class Consumer {
    int kub;
    int sqr;
    int con;
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private AtomicBoolean aBoolean = new AtomicBoolean(true);
    private AtomicBoolean aBooleanK = new AtomicBoolean(true);
    private AtomicBoolean aBooleanS = new AtomicBoolean(true);

    public void inquiry(int kub, int sqr, int con) {
        if(kub==0) {
            if(sqr==0) {
            lck(aBoolean, con);
            } else lck(aBooleanS, sqr);
        } else lck(aBooleanK, kub);

    }
    public int getAtomicInt(){
        return atomicInteger.get();
    }

    private void lck(AtomicBoolean y, int x) {
        while (!y.compareAndSet(true, true)){
            Thread.yield();
        }
        try {
            int xOf = atomicInteger.addAndGet(x);
            System.out.println(xOf);
        } finally {
            y.set(true);
        }
    }

}
