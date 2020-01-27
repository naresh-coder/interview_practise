package threads;

public class HelloThread  extends  Thread{


        private SayHiHello say;

        public  HelloThread( SayHiHello say){
            this.say = say;

        }
        @Override
        public void run() {
            for (int i = 0;i < 10; i++){
               say.print();

            }
        }
    }
