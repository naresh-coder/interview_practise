package threads;

public class ThreadOdd extends Thread {

    private PrinterHelper printerHelper;

    public ThreadOdd(PrinterHelper printerHelper) {
        this.printerHelper = printerHelper;
    }


    @Override
    public void run() {
        for (int i = 1; i < 10; i=i+2) {
            try {
                printerHelper.printOdd(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
