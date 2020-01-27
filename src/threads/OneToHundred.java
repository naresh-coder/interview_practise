package threads;


public class OneToHundred implements Runnable{
    int a=0;
    int lastVal=0;
    static Object object=new Object();
    @Override
    public void run() {
        synchronized (object) {
            while(a < 100) {
                int temp=(lastVal%5)+1;
                String threadReq="Thread "+temp;
                if(Thread.currentThread().getName().equalsIgnoreCase(threadReq)) {
                    ++lastVal;
                    a=lastVal;
                    System.out.println(Thread.currentThread().getName()+" "+(lastVal));
                    object.notifyAll();
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        OneToHundred e=new OneToHundred();
        Thread t1=new Thread(e,"Thread 1");
        Thread t2=new Thread(e,"Thread 2");
        Thread t3=new Thread(e,"Thread 3");
        Thread t4=new Thread(e,"Thread 4");
        Thread t5=new Thread(e,"Thread 5");
//        Thread t6=new Thread(e,"Thread 6");
//        Thread t7=new Thread(e,"Thread 7");
//        Thread t8=new Thread(e,"Thread 8");
//        Thread t9=new Thread(e,"Thread 9");
//        Thread t10=new Thread(e,"Thread 10");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
//        t6.start();
//        t7.start();
//        t8.start();
//        t9.start();
//        t10.start();
    }
}


