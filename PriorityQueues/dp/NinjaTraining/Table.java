package PriorityQueues.dp.NinjaTraining;

public class Table {

    public static void main()
    {
        int[][] points = {{1,2,5},{3,1,1},{3,3,3}};
        int n = points.length;

        int[][] dp = new int[n][4];
        //write the base case
        for(int day = 0; day < n; day++)
        {
            if(day == n-1)
            {
                int maxi = 0;
                int index = -1;
                for(int j = 0; j < 4; j++)
                {
                    if(day != j)
                    {
                        if(points[day][j] > maxi)
                        {
                            maxi = points[day][j];
                            index = j;
                        }
                    }
                }
                dp[day][index] = maxi;
            }
            for(int last = 0; last < 4; last++)
            {
                dp[day][last] = 0;
                int maxi = 0;

            }

        }
    }
}
