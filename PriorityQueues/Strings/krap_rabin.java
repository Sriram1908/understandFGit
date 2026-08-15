package PriorityQueues.Strings;

import java.util.*;


public class krap_rabin
{

    public static void main()
    {
        String s1 = "ram";

        String s2 = "sriram";

        int base = 31;

        long base_Val = 0;

        int m = s1.length();
        int n = s2.length();

        for(int i = 0; i < m; i++)
        {
//            System.out.println(base_Val);
            base_Val +=  (s1.charAt(i) - 'a' + 1) * (long)Math.pow(base , (m-i-1));
        }

        long window = 0;

        for(int i = 0; i < m; i++)
        {
            window +=  (s2.charAt(i) - 'a' + 1) * (long)Math.pow(base , (m-i-1));
        }
        System.out.println(window);
        for(int i = 1; i < n-m+1 ;i++)
        {
            window -= (s2.charAt(i-1)-'a'+1) * (long) Math.pow(base , (m-1));
            //find forr remiang x chars
            window *= base; //after subtracting left shift
            window +=  (s2.charAt(i+m-1) - 'a' + 1);

        }
//        System.out.println(base_Val);
    }

}
