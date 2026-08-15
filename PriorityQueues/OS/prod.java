package PriorityQueues.OS;

import  java.util.*;
import java.util.concurrent.Semaphore;

public class prod {

    static  Queue<Integer> buffer = new LinkedList<>();

    static int size = 5;

    static Semaphore mutex = new Semaphore(1);
    static Semaphore empty = new Semaphore(size);
    static Semaphore full = new Semaphore(0);


    int item = 1;

    class Producer extends Thread{

        public void run()
        {

            while(true)
            {
                try{
                    empty.acquire();
                    mutex.acquire();

                    System.out.println("added " + item);
                    buffer.add(item);
                    item++;

                    mutex.release();
                    full.release();

                    Thread.sleep(1000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    class Consumer extends Thread
    {
        public void run()
        {
            while(true)
            {
                try
                {
                    full.acquire();
                    mutex.acquire();

                    System.out.println("data " + item);
                    item--;

                    mutex.release();
                    empty.release();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }


    static void main() {

    }
}
