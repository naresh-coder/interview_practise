import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class BoundedHashSet<T> {
    public final Set<T> set;
    public final Semaphore sem;

    public BoundedHashSet(int bound) {
        this.set = Collections.synchronizedSet(new HashSet<>());
        sem = new Semaphore(bound);
    }

    public boolean add(T o) throws InterruptedException {
        sem.acquire();
        boolean wasAdded = false;
        try {
            wasAdded = set.add(o);
            return wasAdded;
        } finally {
            if (!wasAdded)
                sem.release();
        }
    }

    public boolean remove(Object o) {
        boolean wasRemoved = set.remove(o);
        if (wasRemoved)
            sem.release();
        return wasRemoved;
    }

    public static void main(String[] args) {
        BoundedHashSet<Integer> integerBoundedHashSet = new BoundedHashSet<>(10);
        for(int i = 1;i <= 20; i++){
            int finalI = i;
            Runnable r = () -> {
                try {
                    integerBoundedHashSet.add(finalI);
                    System.out.println(":Thread==> " +Thread.currentThread());

                    Thread.sleep(10);
                    Random random = new Random();
                    random.ints(0,finalI);
                    integerBoundedHashSet.remove(random.nextInt());


                } catch (InterruptedException e) {
                    //e.printStackTrace();
                    System.out.println(":ERRR");
                }
                finally {
                    System.out.println(integerBoundedHashSet.sem.hasQueuedThreads());
                }
            };

            Thread t = new Thread(r);
            t.start();


            //System.out.println(integerBoundedHashSet);


        }
    }
}