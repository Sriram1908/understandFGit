package PriorityQueues.OS;


import java.util.*;
import java.util.concurrent.Semaphore;

public class ProducerConsumer {

   static Queue<Integer> buffer = new LinkedList<>();

   static int size = 5;
  static  Semaphore mutex = new Semaphore(1);
   static Semaphore empty = new Semaphore(size);
    static Semaphore full = new Semaphore(0);


     static class Producer extends Thread{
        public void run(){
            int item = 1;

            while(true)
            {
                try{
                    empty.acquire();
                    mutex.acquire();

                    buffer.add(item);
                    System.out.println("Produced : " + item);
                    item++;

                    mutex.release();
                    full.release();

                    Thread.sleep(10000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

   static class Consumer extends Thread{


         public void run(){

             while(true)
             {
                 try{
                     full.acquire();
                     mutex.acquire();

                     int item = buffer.poll();
                     System.out.println("Consumed :"+item);

                     mutex.release();
                     empty.release();

                     Thread.sleep(1000);
                 }
                 catch (Exception e)
                 {
                     e.printStackTrace();
                 }
             }
         }
    }

    static void main() {
        Producer p = new Producer();
        Consumer c = new Consumer();

        p.start();
        c.start();
    }
}
