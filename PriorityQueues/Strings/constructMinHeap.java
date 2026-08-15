package PriorityQueues.Strings;

import java.util.*;



public class constructMinHeap {
    static int[] nums = {8, 9, 3, 4, 2};

    static void minHeap()
    {
        for(int i=1; i<nums.length; i++)
        {
            int parent = nums[(i-1) /2];
            if(parent > nums[i])
            {
                swap(i , (i-1)/2);
                minHeap();
            }
        }
    }

    static void maxHeap(){
        for(int i=1; i<nums.length; i++)
        {
            int parent = nums[(i-1) /2];
            if(parent < nums[i])
            {
                swap(i , (i-1)/2);
                maxHeap();
            }
        }
    }

    public static void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main() {
        constructMinHeap c = new constructMinHeap();
//        constructMinHeap.minHeap();
        constructMinHeap.maxHeap();
        System.out.println(Arrays.toString(nums));
    }

}

