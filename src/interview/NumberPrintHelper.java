package interview;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class NumberPrintHelper {
    private int maxThreads = 0;
    private ConcurrentMap<Integer, Boolean> locks = new ConcurrentHashMap<>();
    private int threadNumber = 1;

    public NumberPrintHelper(int maxThreads) {
        this.maxThreads = maxThreads;
        locks.putIfAbsent(1, true);
    }

    public void print(int i) throws Exception {

        boolean isLocked = locks.get(threadNumber);
        synchronized (this) {
            if (!isLocked) {
                wait();
            }
            System.out.println(i);
            threadNumber++;
            if (threadNumber % maxThreads == 0) {
                threadNumber = 1;
            }
            locks.putIfAbsent(threadNumber, true);
            notifyAll();
        }


    }
}
