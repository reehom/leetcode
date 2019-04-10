package Thread;

import java.util.Queue;

public class Consumer implements Runnable {
    private Object plock;
    private Object clock;

    private Queue<Integer> product;

    public Consumer(Object plock, Object clock, Queue product) {
        this.plock = plock;
        this.clock = clock;
        this.product = product;
    }

    @Override
    public void run() {
        try {

//            synchronized (clock) {
                synchronized (plock) {
                    while (true) {
                        if (product.isEmpty()) {
                            System.out.println("队列空了");

//                            clock.wait();
                            plock.wait();
//                            clock.wait();


                        } else {
                            System.out.println(Thread.currentThread().getName() + "   consume  " + product.poll() + "now:" + product.size());
                        }
                        plock.notify();
//                        clock.notify();
                    }
                }


//            }

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
