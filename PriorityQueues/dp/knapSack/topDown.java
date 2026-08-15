package PriorityQueues.dp.knapSack;

public class topDown {

    static void main()
    {
        int[] wt = {1,3,4,5};
        int[] val = {1,4,5,7};
        int W = 7;

        int n = wt.length;

        int[][] table = new int[n+1][W+1];

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= W; j++)
            {
                if(W - val[i-1] <= j)
                {
                    table[i][j] = Math.max(val[j-1] + table[i-1][j-wt[i-1]] , table[i-1][j]);
                }
                else{
                    table[i][j] = table[i-1][j];
                }
            }
        }
        System.out.println(table[n][W]);
    }
}


class twoTop
{
    static void main() {
        int[] wt = {1,3,4,5};
        int[] val = {1,4,5,7};
        int W = 7;

        int n = wt.length;

        int[][] table = new int[n+1][W+1];

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= W; j++)
            {
                if(wt[i-1] <= j)
                {
                    table[i][j] = Math.max(val[i-1] + table[i-1][j-wt[i-1]] , table[i-1][j]);
                }
                else{
                    table[i][j] = table[i-1][j];
                }
            }
        }

        System.out.println(table[n][W]);
    }
}