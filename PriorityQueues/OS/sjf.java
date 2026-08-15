package PriorityQueues.OS;

import java.util.PriorityQueue;

public class sjf {

    static class Node {
        int id;
        int at;
        int bt;
        int tat;
        int wt;
        int ct;

        Node(int id, int at, int bt) {
            this.id = id;
            this.at = at;
            this.bt = bt;
        }
    }

    static void main() {

        int[] at = {0,2,4,5};
        int[] bt = {7,4,1,4};

        int n = at.length;

        Node[] process = new Node[n];

        int ct = 0;
        //it make sures to keep elements in top of queue
        //with low burst time thats why(a-b)

        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) ->a.bt -b.bt);

        Node[] order = new Node[n];
        int idx = 0;

        for(int i = 0; i < n; i++)
            process[i] = new Node(i+1 , at[i] , bt[i]);


        int i = 0;

        while(i< n || !pq.isEmpty())
        {
            while(i < n && process[i].at <= ct)
            {
                pq.add(process[i]); //stores always the shortest job to execute
                //but its sjf so first we need to execute the first come
                i++;
            }

            if(pq.isEmpty())
            {
                ct = process[i].at;
                continue;
            }
            Node curr = pq.poll();
            order[idx++] = curr;

            ct += curr.bt;

            curr.ct = ct;
            curr.tat = curr.ct - curr.at;
            curr.wt = curr.tat - curr.bt;
        }

        System.out.println("                       FCFS\n");
        System.out.println("Pid     AT      BT      CT      TAT      WT");

        i = 0;

        for(i=0; i < n; i++)
        {
            System.out.print(process[i].id + "        " + process[i].at + "      " + process[i].bt+"      " + process[i].ct+"     "+process[i].tat+"      "+process[i].wt);
            System.out.println();
        }



        for (Node p : order) {
            System.out.print(" ---- P" + p.id + " ---- " + p.ct);
        }

    }
}
