package PriorityQueues.dp.knapSack.subsetSum;

public class TopDown {

    static void main() {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;

        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];


        for(int i = 0; i <= n; i++)
                dp[i][0] = true;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= sum; j++)
            {
                if(j >= arr[i-1])
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        System.out.println(dp[n][sum]);
    }
}
