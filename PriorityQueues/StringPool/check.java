package PriorityQueues.StringPool;


import java.util.*;

public class check {

    public static void main() {
        String s1 = "ram";
        String s2 = s1.intern();

        System.out.println(s2);
    }
}
