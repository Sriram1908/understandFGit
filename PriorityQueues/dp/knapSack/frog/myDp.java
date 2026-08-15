package PriorityQueues.dp.knapSack.frog;

public class myDp {
    public static void main() {

        int[] arr = {10,20,30,10};
        int[] dp = new int[arr.length];

        dp[0] = 0;
        dp[1] = Math.abs(arr[1]-arr[0]);

        for(int i = 2; i <arr.length; i++)
        {
            dp[i] = Math.min(dp[i-1] + Math.abs(arr[i]-arr[i-1]) , dp[i-2]+Math.abs(arr[i] - arr[i-2]));

        }

    }
}
