package Thread;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
//        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
//        Future<String> f = newCachedThreadPool.submit(new MyCallable());
//        if(!f.isDone()){
//            System.out.println("task has not finished,please wait!");
//        }
//        try {
//            System.out.println(f.get());
//        }catch (InterruptedException e){
//
//        }catch (ExecutionException e){
//
//        }finally {
//            newCachedThreadPool.shutdown();
//        }
        int c = Integer.SIZE-3;
        int t = (1<<c) - 1;
        System.out.println(3&~t);
    }
}
