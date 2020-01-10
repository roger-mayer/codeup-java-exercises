package hackerrank;

import java.util.*;

import java.io.*;
class Main {
    public static int SimpleAdding(int num) {
        return (num*(num+1))/2;
    }
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int result = Integer.parseInt(input);
        System.out.println(SimpleAdding(result));
    }
}





