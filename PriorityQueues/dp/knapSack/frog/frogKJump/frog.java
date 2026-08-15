package PriorityQueues.dp.knapSack.frog.frogKJump;

import java.util.*;

public class frog {

    static int function(int[] nums , int pos , int k , int[] dp)
    {
        if(pos == 0)
            return 0;

        if(dp[pos] != -1)
                return dp[pos];

        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= k; i++)
        {
            if(pos-i >= 0) {
              int  cost = Math.abs(nums[pos] - nums[pos - i]) + function(nums, pos - i, k , dp);
              min = Math.min(min,cost);
            }
        }
        return dp[pos] = min;
    }

    static void main() {
        int[] arr = {10,20,40,30,10};
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp , -1);
        int ans =  function(arr , arr.length-1, 4 , dp);
    }
}
