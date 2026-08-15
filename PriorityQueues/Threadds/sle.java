package PriorityQueues.Threadds;


import PriorityQueues.DesignPatterns.Singleton.Thr;

class Th1 extends Thread {

    public void run(){
        for(int i = 0; i<5; i++)
        {
            try {
                System.out.println("Th1: Going to sleep for 5 seconds...");
                Thread.sleep(500); // Blocking call
                System.out.println("Th1: Woke up naturally (never reached if interrupted)");
                Thread.interrupted();
            }
            catch (InterruptedException e)
            {
                System.out.println("\n--> Th1 Catch block triggered! Printing stack trace below:\n");
                e.printStackTrace();
            }
            System.out.println("Hello bantu");
        }
    }

}


public class sle {
    public static void main() {

        Th1 t1 = new Th1();
        t1.start();
        Th2 t2 = new Th2("ram ");
        t2.start();
        dans t3 = new dans("daemon");
        t3.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {}

        System.out.println("check is alive");
        System.out.println(t1.isAlive());
        try{
            t1.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getClass().getSimpleName());
        }
//        t1.join();

    }
}

class Th2 extends Thread{
    public Th2(String name)
    {
        super(name);
    }
    public void run(){
        for(int i = 0; i<5; i++)
        {
            try {
                System.out.println("Th2: Going to sleep for 5 seconds...");
                Thread.sleep(5000); // Blocking call
                System.out.println("Th2: Woke up naturally (never reached if interrupted)");
            }
            catch (InterruptedException e)
            {
                System.out.println("\n--> Th2 Catch block triggered! Printing stack trace below:\n");
                e.printStackTrace();
            }
            System.out.println("Hello ram");
        }
    }
}

class dans extends  Thread{

    int i = 0;
    public dans(String name)
    {
        super(name);
        setDaemon(true);
    }
    public void run(){
        while(true){
            System.out.println("User thread is still working"+i);
            i++;
            try{
                sleep(250);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}