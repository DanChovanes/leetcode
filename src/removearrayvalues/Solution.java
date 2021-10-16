package removearrayvalues;

// if given an array and a value to remove from the array
// edit the array in place to swap the value to the end of the array and
// return the length of the array without the end

// i.e. {1, 2, 2, 2, 3, 4, 5, 6}, 2 => {1, 3, 4, 5, 6, 2, 2, 2 }, length=5

// int[] arr = {3,2,2,3}; //-1, 10, 3, 6, 9, 11, 4, 3, 17, 3, 22

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5, 6};
        int val = 2;

        System.out.println(removeValues(arr, val));
    }

    public static int removeValues(int[] nums, int val) {
        for (int i = 0, j = nums.length - 1; i < nums.length && j > 0; i++) {
            if (nums[i] == val) {
                while (nums[j] == val && j > i) j--;

                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }

        int newLength = 0;
        for (int i : nums)
            if (i != val)
                newLength++;

        System.out.print("Nums: { ");
        for (int i : nums) System.out.print(i + " ");
        System.out.print(" }");
        System.out.println();

        System.out.println("New length: " + newLength);
        return newLength;
    }
}
