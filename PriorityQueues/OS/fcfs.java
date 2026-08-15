package PriorityQueues.OS;

public class fcfs {


   static class Node{
        int id;
        int at;
        int bt;
        int tat;
        int wt;
        int ct;

        Node(int id , int at , int bt)
        {
            this.id = id;
            this.at = at;
            this.bt = bt;
        }
    }

    static void main()
    {
            int[] at = {0,1,2,3};
            int[] bt = {5,3,8,6};

            int n = at.length;

        Node[] processes = new Node[n];
            int ct = 0;

            for(int i = 0; i < n; i++)
            {
                Node curr = new Node(i+1 , at[i] , bt[i]);

                if(ct <= curr.at)
                {
                    ct = curr.at;
                }

                ct += curr.bt;
                curr.ct = ct;
                curr.tat = curr.ct - curr.at;
                curr.wt = curr.tat - curr.bt;

                processes[i] = curr;
            }
        System.out.println("                       FCFS\n");
        System.out.println("Pid     AT      BT      CT      TAT      WT");

            for(int i = 0; i < n; i++)
            {
                System.out.print(processes[i].id + "        " + processes[i].at + "      " + processes[i].bt+"      " + processes[i].ct+"     "+processes[i].tat+"      "+processes[i].wt);
                System.out.println();
            }

    }
}
