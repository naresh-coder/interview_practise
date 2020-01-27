package threads;

public class DeadLock {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.setB(b);
        b.setA(a);


        Runnable r = ()-> a.print();
        Runnable r1 = ()->b.display();

        Thread thread = new Thread(r);
        thread.start();
        Thread thread1 = new Thread(r1);
        thread1.start();
    }
}
