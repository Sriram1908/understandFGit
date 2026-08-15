package PriorityQueues.Strings;

import java.util.*;

public class subClassIssue {
    public static int lengthOfLongestSubstring(String s)
    {
        HashMap<Character , Integer> mp = new HashMap<>();

        int left = 0;
        int max = 0;

        for(int right = 0; right < s.length(); right++)
        {
            char ch = s.charAt(right);

            if(mp.containsKey(ch))
            {
                left = mp.get(ch)+1;
                // mp.remove(ch);
            }
            mp.put(ch , right);
            max = Math.max(max , right-left+1);
        }
        return max;
    }
    static void main() {
        String s = "tmmzuxt";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
