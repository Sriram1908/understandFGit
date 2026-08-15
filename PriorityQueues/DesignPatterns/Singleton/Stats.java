package PriorityQueues.DesignPatterns.Singleton;

public class Stats {
    static {
        System.out.println("In static");
    }

    {
        System.out.println("In instance");
    }

    public static void main() throws ClassNotFoundException, InstantiationException, IllegalAccessException {

       Stats s = (Stats) Class.forName("PriorityQueues.DesignPatterns.Singleton.Singleton").newInstance();

    }
}
