package PriorityQueues.DesignPatterns.Singleton;

class MyThread1 extends Thread {

    StringBuilder sb;

    MyThread1(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {
            sb.append("A");
        }
    }
}


class MyThread2 extends Thread {

    StringBuilder sb;

    MyThread2(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {
            sb.append("B");
        }
    }
}


 class Main {

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        MyThread1 t1 = new MyThread1(sb);
        MyThread2 t2 = new MyThread2(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sb.length());
    }
}