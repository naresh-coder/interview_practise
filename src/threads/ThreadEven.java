package threads;

public class ThreadEven extends Thread {


    private PrinterHelper printerHelper;

    public ThreadEven(PrinterHelper printerHelper) {
        this.printerHelper = printerHelper;
    }


    @Override
    public void run() {
        for (int i = 2; i <= 10; i=i+2) {
            try {
                printerHelper.printEven(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
