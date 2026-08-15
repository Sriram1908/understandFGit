package PriorityQueues.dp.knapSack.subsetSum;

public class memo {


    static boolean memoiz(int[] nums , int sum , int pos, int target , Boolean[][] dp)
    {

        if(sum == target)
            return true;


        if(pos == nums.length || sum > target)
            return false;

        if(dp[pos][sum] != null)
            return dp[pos][sum];

        return dp[pos][sum] = memoiz(nums , sum+nums[pos] , pos + 1 , target , dp) || memoiz(nums , sum , pos + 1 , target , dp);
    }

    static void main() {
        int[] arr = {100 ,1 , 2 ,3};
        int target = 5;
        Boolean[][] dp = new Boolean[arr.length + 1][target+1];

        System.out.println(memoiz(arr , 0 , 0 , target , dp));
    }
}
