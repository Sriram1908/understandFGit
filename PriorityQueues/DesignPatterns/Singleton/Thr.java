package PriorityQueues.DesignPatterns.Singleton;



class work1 extends  Thread{

//    Thread t1 ;
//
//    public work1(Thread t1)
//    {
//        this.t1 = t1;
//    }
    public void run(){
        for(int i = 0; i < 50; i++)
            System.out.println("in work1 "+i);
    }
}

class work2 extends Thread{

    public void run(){
        for(int i = 0; i < 5; i++)
            System.out.println("in work2 "+i);
    }
}

public class Thr {
    public static void main() {

        work2 w2 = new work2();

        work1 w1 = new work1();

        w1.start();
//
//        try {
//            w1.join();
//        }
//        catch (InterruptedException i)
//        {
//            System.out.println("catched "+i.getStackTrace());
//        }
//        catch (Exception e)
//        {
//            System.out.println("another catch block catched "+e.getClass());
//        }
        w2.start();



    }
}
