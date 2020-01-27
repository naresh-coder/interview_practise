package threads;

public class PrintSequenceRunnable extends Thread {

    private int print_number  =10;
    volatile Object lock = new Object();

    @Override
    public void run() {
    }
}
