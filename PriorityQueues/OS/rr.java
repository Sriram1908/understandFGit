package PriorityQueues.OS;

import java.util.*;

public class rr {

    static class Node {
        int id;
        int at;
        int bt;

        int tat;
        int wt;
        int ct;
        int rt;

        Node(int id, int at, int bt) {
            this.id = id;
            this.at = at;
            this.bt = bt;
            this.rt=bt;
        }
    }

    static void main() {
        int[] at = {0,1,2,4};
        int[] bt = {5,4,2,1};

        Queue<Node> q = new LinkedList<>();

        int tq = 2;

        int n = at.length;
        Node[] Process = new Node[n];
        for(int i = 0; i < n; i++)
            Process[i] = new Node(i+1 , at[i] , bt[i]);

        int ct = 0;
        int i = 0;

        while(i < n || !q.isEmpty())
        {
            while(i < n && Process[i].at <= ct)
            {
                q.add(Process[i]);
                i++;
            }

            if(q.isEmpty())
            {
                ct = Process[i].at;
                continue;
            }
            Node curr = q.poll();

            int run = Math.min(curr.rt , tq);
            ct += run;
            curr.rt -=run;

            while( i < n && Process[i].at <= ct)
            {
                q.add(Process[i]);
                i++;
            }

            if(curr.rt <= 0)
            {
                curr.ct = ct;
                curr.tat = curr.ct - curr.at;
                curr.wt = curr.tat - curr.bt;
            }
            else{
                q.add(curr);
            }

        }
    }
}
