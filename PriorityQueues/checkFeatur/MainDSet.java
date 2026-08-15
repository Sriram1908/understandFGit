package PriorityQueues.Graph.Disjoint.Disjoint;

import java.util.*;

public class MainDSet {

    class DisjointSet
    {
        List<Integer> rank = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();

        public DisjointSet(int n)
        {
            for(int i = 0; i <= n; i++)
            {
                rank.add(0);
                parent.add(i);
            }
        }
        public int findUPar(int node){
            if(node == parent.get(node))
                return node;

            int ultimate = findUPar(parent.get(node));
            parent.set(node , ultimate);
            return parent.get(node);
        }
        public void unionByRank(int u, int v)
        {
            int ulp_u = findUPar(u);
            int Ulp_v = findUPar(v);

            int rankU = rank.get(ulp_u);
            int rankV = rank.get(Ulp_v);

            if(rankU < rankV)
            {
                parent.set(ulp_u, Ulp_v);
            }
            else if (rankV < rankU)
            {
                parent.set(Ulp_v, ulp_u);
            }
            else{
                parent.set(ulp_u, Ulp_v);
                rank.set(ulp_u, rankU+1);
            }
        }
    }




    static void main()
    {

    }
}
