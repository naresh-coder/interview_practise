package threads;

public class HiHelloMain {

    public static void main(String[] args) {

        SayHiHello sayHiHello = new SayHiHello();

        HiThread hiThread = new HiThread(sayHiHello);
        HelloThread helloThread = new HelloThread(sayHiHello);

        hiThread.start();
        helloThread.start();


    }
}
