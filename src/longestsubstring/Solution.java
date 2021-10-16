package longestsubstring;

import java.util.HashMap;

// if given a string, report the length of the longest substring containing only unique characters

public class Solution {
    public static void main(String[] args) {
        String s = "dvdf";

        System.out.println(longestSubString(s));
    }

    public static int longestSubString(String s) {
        int maxLength=0;
        HashMap<Character, Integer> hash = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            if ( hash.containsKey(s.charAt(i)) ) {
                maxLength = Math.max(maxLength, hash.size());
                i = hash.get(s.charAt(i));
                hash.clear();
            } else {
                hash.put( s.charAt(i), i );
            }
        }
        return Math.max(maxLength, hash.size());
    }
}
