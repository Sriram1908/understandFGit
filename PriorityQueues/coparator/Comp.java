package PriorityQueues.coparator;

import java.lang.*;
import java.util.*;

import static java.util.Arrays.compare;

public class Comp {

    static class std {
        int age;
        String name;

        std(String name, int age) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return this.age + " "+this.name;
        }

        public static void main() {
            Integer[] nums = {3, 4, 2, 1, 0, 8, 6, 9};
            Arrays.sort(nums, (a, b) -> a-b);
            System.out.println(Arrays.toString(nums));

            std s1 = new std("sram", 22);
            std s2 = new std("srs11am", 232);
            std s11 = new std("sram1", 2);

            std[] s = new std[3];
            s[0] = s1;
            s[1] = s2;
            s[2] = s11;

            Arrays.sort(s, (a, b) -> a.age - b.age);

            System.out.println(Arrays.toString(s));

            String s12 = "Apple";
            String s22 = "Banana";
            System.out.println(s12.compareTo(s22)); // Negative (A comes before B)

            Integer n1 = 10;
            Integer n2 = 5;
            System.out.println(n1.compareTo(n2)); // Positive (10 is greater than 5)
        }
    }
}
