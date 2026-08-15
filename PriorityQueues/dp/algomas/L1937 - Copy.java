package PriorityQueues.dp.algomas;
import java.util.*;


public class L1937 {

   public static long maxPoints(int[][] points)
    {
        return helper(points, 0, 0, -1);

    }
    public static long helper(int[][] nums, int r, int c, int prev)
    {
        if(r >= nums.length || c >= nums[0].length)
            return 0;
        if(nums.length-1 == r || nums[0].length-1 == c)
        {
            long max = 0;

            for(int i = 0; i < nums[0].length; i++)
            {
                max = Math.max(max, nums[r][c]);
            }

            return max;
        }

        long max = 0;

        for(int i = 0; i < nums[0].length; i++)
        {
            long curr = nums[r][c] + helper(nums, r+1, c+i, c);
            if(prev != -1)
                curr = curr - Math.abs(c-prev);

            max = Math.max(max, curr);
        }
        return max;
    }


    public static void main()
    {
        int[][] points = {{1,2,3},{1,5,1},{3,1,1}};
        long ans = maxPoints(points);
    }
}
