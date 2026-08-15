package PriorityQueues.dp.traingle;

import java.util.*;

public class recur
{
    static public int minimumTotal(List<List<Integer>> triangle)
    {
        if(triangle.size() == 1)
            return triangle.get(0).get(0);

        return helper(triangle , 0 , 0);
    }
    static int helper(List<List<Integer>> ans , int row , int pos)
    {
        if(row == ans.size()-1)
        {
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < row; i++)
            {
                min = Math.min(min , ans.get(row).get(i));
            }
            return min;
        }

        int first = ans.get(row).get(pos) + helper(ans , row +1 , pos);
        int sec = ans.get(row).get(pos) + helper(ans , row +1 ,pos+1);

        return Math.min(first , sec);

    }
    public static void main()
    {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(-1)));
        ans.add(new ArrayList<>(Arrays.asList(-2,-3)));
        System.out.println(minimumTotal(ans));
    }
}
