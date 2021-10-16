package removeinteriorwhitespace;

// remove whitespace between two words leaving leading/trailing whitespace

// i.e. "    dump    truck  " => "    dumptruck  "

public class Solution {
    public static void main(String[] args) {

        String s = "    dump    truck  ";

        System.out.println(trimInterior(s));
    }

    public static String trimInterior(String s) {

        StringBuilder str = new StringBuilder(s);

        int j=0, k=0;
        for ( int i=0; i<s.length()-1; i++ ) {

            if (s.charAt(i) != ' ' && s.charAt(i+1) == ' ' && k==0) {
                j = i;
            }

            if (i > j && s.charAt(i) == ' ' && s.charAt(i+1) != ' ' && j!=0) {
                k = i+1;
            }
        }
        return ( k==0 || j>k ) ? str.toString() : str.delete(j+1, k).toString();
    }

}
}
