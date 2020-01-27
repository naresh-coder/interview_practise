package threads;

public class MainOddEven {

    public static void main(String[] args) {


        PrinterHelper printerHelper = new PrinterHelper();

        ThreadOdd threadOdd = new ThreadOdd(printerHelper);
        threadOdd.setName("Thread ODD");

        ThreadEven threadEven = new ThreadEven(printerHelper);
        threadEven.setName("Thread Even");
        threadOdd.start();
        threadEven.start();

    }
}
