package threads;

public class A {

    B b ;

    public void setB(B b) {
        this.b = b;
    }

    public synchronized  void print(){
        try {
            Thread.sleep(10l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.display();
    }
}
