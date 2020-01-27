package interview;

public class PrintSequenceThread extends Thread {

    private NumberPrintHelper printHelper;


    public void run() {

        try {
            for (int i = 1; i < 10; i = 1 + i) {
                printHelper.print(i);
            }

        } catch (Exception e) {

        }

    }
}
