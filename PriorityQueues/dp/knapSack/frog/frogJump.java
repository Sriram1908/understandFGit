package PriorityQueues.dp.knapSack.frog;


public class frogJump {

    static void main() {
        int[] arr = {10, 20, 30, 10 };
       int ans =  reCur(arr , arr.length-1);

       System.out.println(ans+" ");
    }
    static int reCur(int[] nums , int pos)
    {
        if(pos == 0)
            return 0;

        int left = Math.abs(nums[pos] - nums[pos-1]) + reCur(nums , pos-1);

        int right = 10000000;
        if(pos > 1)
            right = Math.abs(nums[pos] - nums[pos-2]) + reCur(nums , pos-2);

        return Math.min(left , right);
    }
}
