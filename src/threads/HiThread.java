package threads;

public class HiThread extends Thread {

    private SayHiHello say;

    public  HiThread( SayHiHello say){
        this.say = say;

    }


    @Override
    public void run() {
       for (int i = 0;i < 10; i++){
           say.print();
       }
    }
}
