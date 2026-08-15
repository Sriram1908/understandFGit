package PriorityQueues.dp.knapSack.frog.frogKJump;

public class tabulaization {

    public static void main()
    {
        int[] arr = {10,20,40,30,10};

        int k = 4;
        int[] dp = new int[arr.length];
        dp[0] = 0;
        dp[1] = Math.abs(arr[1]-arr[0]);


        for(int pos = 2; pos <arr.length; pos ++)
        {
            int min = Integer.MAX_VALUE;

            for(int jump = 1; jump <= k; jump++)
            {
                if(pos-jump >=0)
                {
                    int cost = Math.abs(arr[pos]- arr[pos-jump]) + dp[pos-jump];
                    min = Math.min(cost , min);
                }

            }
            dp[pos] = min;

        }

    }
}
