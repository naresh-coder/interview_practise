package interview;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadNumberPrinter {

    Object monitor = new Object();
    AtomicInteger number = new AtomicInteger(0);

    public static void main(String[] args) {
        ThreadNumberPrinter tnp = new ThreadNumberPrinter();
        configureNoOfThreadAndNumbers(tnp, 10, 100);

    }

    private static void configureNoOfThreadAndNumbers(ThreadNumberPrinter tnp, int noOfThreads, int numbers) {

        Thread[] threads = new Thread[noOfThreads];
        for (int i = 0; i < noOfThreads; i++) {
            threads[i] = new Thread(tnp.new Printer(i, noOfThreads,numbers));
        }

        for (int i = 0; i < noOfThreads; i++) {
            threads[i].start();
        }
    }

    class Printer implements Runnable {

        int threadId;
        int numOfThreads;
        int numberLimit;

        public Printer(int id, int nubOfThreads,int numberLimit) {
            threadId = id;
            this.numOfThreads = nubOfThreads;
            this.numberLimit = numberLimit;
        }

        public void run() {
            print();
        }

        private void print() {
            try {
                while (true && number.get() <= numberLimit) {
                   // Thread.sleep(1000l);
                    synchronized (monitor) {
                        if (number.get() % numOfThreads != threadId) {
                            monitor.wait();
                        } else {
                            System.out.println("ThreadId [" + (threadId)
                                    + "] printing -->"
                                    + number.getAndIncrement());
                            monitor.notifyAll();
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}