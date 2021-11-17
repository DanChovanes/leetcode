package reversestring;

import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        String[] strings = {"Hello,    World   ", "racecar", "It was the best of times, it was the worst of times."};

        for (String s: strings) {
            reverseString(s);
            System.out.println();
        }
    }

    public static void reverseString(String toReverse) {
//        if (toReverse.length() != 0) {
//            reverseString(toReverse.substring(1));
//            System.out.print(toReverse.charAt(0));
//        }

        System.out.println(new StringBuilder(toReverse).reverse());
    }
}
