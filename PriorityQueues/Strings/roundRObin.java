package PriorityQueues.Strings;


import java.util.*;

public class roundRObin {

    static class Node{
        int id;
        int at;
        int bt;
        int ct;

        int rt;
        int wt;
        int tat;

        Node(int id , int at , int bt)
        {
            this.id = id;
            this.at = at;
            this.bt = bt;
            this.rt = bt;
        }
    }


    static void main() {

        int[] at = {2,4,5,0};
        int[] bt = {5,4,7,2};

        int tq = 2;

        int n = at.length;

        Node[] process = new Node[n];

        for(int i = 0; i < n; i++)
            process[i] = new Node(i+1 , at[i] , bt[i]);

        Queue<Node> q = new LinkedList<>();

       int ct = 0;
       int i = 0;

       while(i < n || !q.isEmpty())
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

           int run  = Math.min(curr.rt , tq);
           ct += run;

           curr.rt -= run;

           while(i < n && process[i].at <=ct)
           {
               q.add(process[i]);
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
