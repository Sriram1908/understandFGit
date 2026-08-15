package PriorityQueues.dp.knapSack;

import java.util.Arrays;

public class memo {


    static int memozation(int[] wt , int[] val , int W , int pos , int[][] dp)
    {
        if(wt.length <= pos || W == 0)
            return 0;

        if(dp[pos][W]!=-1)
                return dp[pos][W];

        int take = 0;
        if(W-val[pos] >= 0)
            take = val[pos] + memozation(wt , val , W-val[pos] , pos+1 , dp);

        int notTake = memozation(wt, val, W, pos + 1, dp);

        return Math.max(take , notTake);
    }





    static void main()
    {
        int[] wt = {1,3,4,5};
        int[] val = {1,4,5,7};
        int W = 7;

        int[][] dp = new int[wt.length+1][W+1];
        for(int[] d : dp)
            Arrays.fill(d,-1);

        int as = memozation(wt , val , W , 0 , dp);
        System.out.println(as);
    }
}
