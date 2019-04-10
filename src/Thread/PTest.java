package Thread;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class PTest {
    public static void main(String[] args) {
        Object plock = new Object();
        Object clock = new Object();
        Queue<Integer> product = new LinkedBlockingQueue<>(10);
        Producer p1 = new Producer(plock,clock,product);
        Consumer c1 = new Consumer(plock,clock,product);
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p1);
        Thread t3 = new Thread(p1);
        Thread t4 = new Thread(p1);
        Thread t11 = new Thread(c1);
        Thread t12 = new Thread(c1);
        Thread t13 = new Thread(c1);
        Thread t14 = new Thread(c1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t11.start();
        t12.start();
        t13.start();
        t14.start();
    }
}
