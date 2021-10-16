package main;

import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
        String s = "";
        int[] arr = {3,2,2,3}; //-1, 10, 3, 6, 9, 11, 4, 3, 17, 3, 22
        int target = 3;

        //System.out.println(longestSubString(s));
    }

    public static void getTwoSums(int[] arr, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] loc = new int[2];

        //O(N) solution
        for (int i=0; i<arr.length; i++) {
            hash.put(arr[i], i);

            if (hash.containsKey(target-arr[i])) {
                loc[0] = i; loc[1] = hash.get(target-arr[i]);
            }
        }

        for (int l : loc) System.out.println(l);
    }

    public static int removeValues(int[] nums, int val) {
        for (int i=0, j=nums.length-1; i<nums.length && j>0; i++) {
            if ( nums[i] == val ) {
                while ( nums[j] == val && j>i ) j--;

                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }

        int newLength=0;
        for (int i : nums)
            if (i!=val)
                newLength++;

        System.out.print("Nums: { ");
        for (int i : nums) System.out.print(i + " ");
        System.out.print(" }");
        System.out.println();

        System.out.println("New length: " + newLength);
        return newLength;
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