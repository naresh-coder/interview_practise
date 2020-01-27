package threads;

public class PrinterHelper {

    volatile boolean isOdd = true;


    public synchronized void printOdd(int n) throws InterruptedException {


        if (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                // e.printStackTrace();
            }
        }

        System.out.println(" Current" + Thread.currentThread() + "===" + n);
        isOdd = false;
        notify();

    }

    public synchronized void printEven(int n) throws InterruptedException {

        if (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                // e.printStackTrace();
            }
        }
        System.out.println(" Current" + Thread.currentThread() + "===" + n);
        isOdd = true;

        notify();

    }
}
