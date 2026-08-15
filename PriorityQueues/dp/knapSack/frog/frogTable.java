package PriorityQueues.dp.knapSack.frog;

import java.util.Arrays;

public class frogTable {
    static void main() {
        int[] nums = {10,30,40,20,50};

        int n = nums.length;

        int[] dp = new int[n];

        dp[0] = 0;

        for(int i = 1; i < n; i++)
        {
            int f = dp[i-1] + Math.abs(nums[i] - nums[i-1]);
            int s = Integer.MAX_VALUE;

            if(i > 1)
                s = dp[i-2] + Math.abs(nums[i] - nums[i-2]);

            dp[i] = Math.min(f , s);
        }
        System.out.println(Arrays.toString(dp));
    }
}
