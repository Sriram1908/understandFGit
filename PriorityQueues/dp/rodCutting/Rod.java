package PriorityQueues.dp.rodCutting;

public class Rod
{
    public int cutRod(int[] price)
    {
        // code here

        return helper(price, 0, price.length, 0, 0);
    }
    int helper(int[] price, int pos, int N, int sum, int rodCt)
    {
        if(rodCt > N)
            return 0;
        if(rodCt == N )
            return sum;

        int take = -1000000000;

        take = helper(price, pos, N, sum+price[pos], rodCt+1);
        int skip = helper(price, pos+1, N, sum, rodCt);

        return Math.max(take, skip);
    }


    public static void main() {
        Rod r = new Rod();
        r.cutRod(new int[]{1,5,8,9,10,17,17,20});
    }
}