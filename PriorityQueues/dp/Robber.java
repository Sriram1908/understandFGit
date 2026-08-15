package PriorityQueues.dp;

public class Robber {

   static int minCost(int[] height)
    {

        // code here

        return helper(height , 0);

    }

   static int helper(int[] nums , int pos)
    {
        if(pos == nums.length)
            return 0;

        int jump = 0;

        if(pos < nums.length-1)
            jump = Math.abs(nums[pos] - nums[pos+1]) + helper(nums , pos+1);

        int notJump = 0;

        if(pos < nums.length-2)
            notJump = Math.abs(nums[pos] - nums[pos+2]) + helper(nums , pos+2);

        return Math.min(jump , notJump);

    }

    static void main() {
        int[] heights = {10 , 30 , 40 , 20 , 50};
        System.out.println(minCost(heights));
    }
}
