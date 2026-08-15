package PriorityQueues.dp.kmp;

import java.util.*;

public class kmp {

    static void main()
    {
        String text = "ABCABCABCD";
        String pattern = "ABCABCD";

        int m = text.length();
        int n = pattern.length();

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < m;i++)
        {
            int j;
            for(j = 0; j < n; j++)
            {
                if(text.charAt(i+j) != pattern.charAt(j))
                {
                    break;
                }
            }

            if(j == m)
                ans.add(i);
        }
    }
}
