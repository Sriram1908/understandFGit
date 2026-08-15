package PriorityQueues.OS;

import java.util.PriorityQueue;

public class priority {

    static class Node {
        int id;
        int at;
        int bt;
        int pr;

        int tat;
        int wt;
        int ct;

        Node(int id, int at, int bt , int pr) {
            this.id = id;
            this.at = at;
            this.bt = bt;
            this.pr = pr;
        }
    }

    static void main()
    {
        int[] at = {0,2,4,5};
        int[] bt = {5,3,8,6};
        int[] pr = {3,1,2,4};

        int n = at.length;

        Node[] process = new Node[n];

        for(int i = 0; i < n; i ++)
            process[i] = new Node(i+1 , at[i] , bt[i] , pr[i]);

        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) ->a.pr-b.pr);

        int i = 0;
        int ct = 0;

        while(i < n || !pq.isEmpty())
        {
            while(i < n &&  process[i].at <= ct)
            {
                pq.add(process[i]);
                i++;
            }

            if(pq.isEmpty())
            {
                ct = process[i].at;
               continue;
            }

            Node curr = pq.poll();
            ct += curr.bt;

            curr.ct = ct;
            curr.tat = curr.ct - curr.at;
            curr.wt = curr.tat - curr.bt;

        }
    }

}
