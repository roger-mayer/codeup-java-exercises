package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
public class ClassPractice {
    public static void main(String[] args) {
        System.out.println("working");
// Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");

        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */

        Collections.sort(al);

        // Let us print the sorted list
        System.out.println("List after the use of" +
                " Collection.sort() :\n" + al);
    }



    //write a method to return a double that calculates parameter 1 to exponent of param 2
    public static double warmup (double base, double exponent){


        double bucket = base;
        for (int i = 1; i <= exponent; i++){
            bucket += (base*bucket);
        }
        return bucket;
    }


}
