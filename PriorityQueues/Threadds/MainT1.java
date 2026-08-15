package PriorityQueues.Threadds;

import java.lang.*;

import PriorityQueues.DesignPatterns.Singleton.Thr;

class R1 implements Runnable{

    Thread t1;

    public R1(){
        t1 = new Thread(this);
    }
    public void run(){
        for(int i = 0; i < 5; i++)
        {
            System.out.println("IN r1 "+i);
        }
    }


    public void start(){
        t1.start();
    }

}

public class MainT1 {

    public static void main() {

        R1 r = new R1();
        r.start();
        Thred1 t = new Thred1();
        t.start();
    }
}

class Thred1 extends Thread{

    public void run(){
        for (int i = 0; i <=4; i++)
            System.out.println("In run "+i);
    }
}