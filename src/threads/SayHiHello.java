package threads;

public class SayHiHello {

    private String sayHi = "HI";

    private String sayHello = "Hello";

    private volatile boolean flip = false;

    public synchronized void setFlip(boolean f) {
        flip = f;
    }
    public synchronized boolean isFlip() {
        return flip;
    }

    public synchronized void print() {
        if (!this.isFlip()) {
            this.getSayHi();
            this.setFlip(true);
        } else {
            this.getSayHello();
            this.setFlip(false);
        }
    }

    public synchronized String getSayHello() {
        System.out.println(sayHello);
        flip = false;
        return sayHello;
    }

    public synchronized String getSayHi() {
        System.out.println(sayHi);
        flip = true;
        return sayHi;
    }
}
