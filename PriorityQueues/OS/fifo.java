package PriorityQueues.OS;

import java.util.*;

public class fifo {
    static void main() {

        int frames = 3;
        int[] pages = {7,0,1,2,0,3,0,4,2,3,0,3,2};

        Queue<Integer> q = new LinkedList<>();

        int hits = 0;
        int faults = 0;



        for(int i = 0; i < pages.length; i++)
        {
            if(q.contains(pages[i]))
                hits++;
            else{

                faults++;
                if(q.size() == frames)
                {
                    q.poll();
                }
                q.add(pages[i]);
            }
        }
    }
}
