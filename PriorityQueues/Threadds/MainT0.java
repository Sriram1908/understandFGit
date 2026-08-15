package PriorityQueues.Threadds;


import PriorityQueues.DesignPatterns.Singleton.Thr;

import java.util.*;
import java.lang.*;

public class MainT0 {


    public static void main() {
        Thread t1 = Thread.currentThread();
        t1.setName("Sriram");
        t1.setPriority(10);

        System.out.println(t1);
    }
}
