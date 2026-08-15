package PriorityQueues.OS;

import java.util.*;

public class LRU {

    static void main()
    {
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

                if(l.size()==frames)
                {
                    int replace = -1;
                    int least = n+1;

                    for(int k = 0; k < l.size(); k++)
                    {
                        int ele = l.get(k);
                        int lastUsed = -1;

                        for(int j = i-1; j >= 0; j--)
                        {
                            if(pages[j] == ele) {
                                lastUsed = j;
                                break;
                            }
                        }
                        if(lastUsed < least)
                        {
                            least = lastUsed;
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
