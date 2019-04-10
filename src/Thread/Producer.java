package Thread;

import java.util.List;
import java.util.Queue;

public class Producer implements Runnable {

    private Object clock ;

    private Object plock ;

    private Queue<Integer> product;

    public Producer(Object plock, Object clock, Queue product) {
        this.plock = plock;
        this.clock = clock;
        this.product = product;
    }

    @Override
    public void run() {
        try {

            synchronized (plock) {
//                synchronized (clock) {
                    while (true) {
                        if (product.size() >= 10) {
                            System.out.println("队列满了");


//                            wait();
//                            this.wait();
//                            clock.wait();
                            plock.wait();

                        } else {
                            product.offer(1);
                            System.out.println(Thread.currentThread().getName() + "      produce,now:" + product.size());
                        }
//                        clock.notify();
                        plock.notify();
                    }

                }

//            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

}
