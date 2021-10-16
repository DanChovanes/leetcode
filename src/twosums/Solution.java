package twosums;

import java.util.HashMap;

// if given an array and a target value
// find the indices of the two array values that will add together to equal the target value
// arr = { 1, 2, 4, 5 }, 6 => arr[1] + arr[2] = 6

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 3, 67, 43, 2};
        int target = 70;

        getTwoSums(arr, target);
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
}