package PriorityQueues.dp.NinjaTraining;

public class ninja {

    public static void main()
    {
        int[][] points = {{1,2,5},{3,1,1},{3,3,3}};

        int ans = helper(points , 3 , 0);
    }

    static int helper(int[][] task ,int last , int day)
    {
        if(day == task.length-1)
        {
            int maxi = 0;
            for(int i = 0; i < 2; i++)
                if(i!=last)
                    maxi = Math.max(maxi , task[i][last]);

            return maxi;
        }

        int max = 0;

        for(int i = 0; i < 2; i++)
        {
            int points;
            if(i != last)
            {
                points = task[day][i] + helper(task , i , day+1);
                max = Math.max(max , points);
            }

        }
        return max;

    }
}
