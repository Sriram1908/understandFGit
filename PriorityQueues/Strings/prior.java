package PriorityQueues.Strings;

import java.util.*;

public class prior {

    static class Node{
        int id;
        int at;
        int bt;
        int ct;
        int tat;
        int wt;
        int pr;

        Node(int id , int at , int bt , int pr)
        {
            this.id = id;
            this.at = at;
            this.bt = bt;
            this.pr = pr;
        }
    }

    static void main() {

        int[] at = {0,1,2,4};
        int[] bt = {5,4,2,1};

        int n = at.length;

        Node[] process = new Node[n];

        PriorityQueue<Node> q = new PriorityQueue<>((a,b) ->a.pr-b.pr);

        int i = 0;
        int ct = 0;

        while (i < n || !q.isEmpty())
        {
            while (i < n && process[i].at <= ct)
            {
                q.add(process[i]);
                i++;
            }

            if(q.isEmpty())
            {
                ct = process[i].at;
                continue;
            }

            Node curr = q.poll();

            ct += curr.bt;
            curr.ct = ct;
            curr.tat = curr.ct - curr.at;
            curr.wt = curr.tat - curr.bt;
        }
    }
}
