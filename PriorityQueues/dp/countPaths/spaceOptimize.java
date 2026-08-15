package PriorityQueues.dp.countPaths;

import java.util.Arrays;

public class spaceOptimize {

    public static void main() {
        int m = 3;
        int n = 3;

        int[] prev = new int[n];

        for(int i = 0; i < m; i++)
        {
            int[] curr = new int[m];
            for(int j = 0; j < n; j++)
            {
                if(i == 0 && j == 0)
                {
                    curr[j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                if(i > 0)
                    up = prev[j];
                if(j>0)
                    left = curr[j-1];

                curr[j] = up + left;
            }
            prev = curr;
        }
        System.out.println(prev[n-1]);
    }
}
