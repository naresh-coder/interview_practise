package threads;

public class B {
    A a;
    public  void setA(A a){
        this.a = a;
    }

    public  synchronized void display(){
       try{
           Thread.sleep(10l);

       }catch (Exception e){

       }
       a.print();
    }
}
