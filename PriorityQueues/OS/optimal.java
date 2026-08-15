package PriorityQueues.OS;


import java.util.*;

public class optimal {

    static void main() {
        int frames = 3;
        int[] pages = {1,2,3,4,2,1,5,2,4,5};

        int hits = 0;
        int faults = 0;

        int n = pages.length;
        List<Integer> l = new ArrayList<>();


        for(int i = 0; i < n; i++)
        {
            if(l.contains(pages[i]))
            {
                hits++;
            }
            else{
                faults++;

                if(l.size() == frames)
                {
                    int replace = -1;
                    int farthest = -1;

                    //search every element in l

                    for(int k = 0; k < l.size(); k++)
                    {
                        int page = l.get(k);
                        int nextUse = Integer.MAX_VALUE;

                        for(int j = i+1; j < n; j++)
                        {
                            if(pages[j] == page)
                            {
                                nextUse = j;
                                break;
                            }
                        }
                        if(nextUse > farthest)
                        {
                            farthest = nextUse;
                            replace = k;
                        }
                    }
                    l.set(replace , pages[i]);
                }
                else{
                    l.add(pages[i]);
                }
            }
        }


    }
}
