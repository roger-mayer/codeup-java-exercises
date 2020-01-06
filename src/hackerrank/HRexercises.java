package hackerrank;

import java.util.Scanner;
import java.util.*;
import java.io.*;


public class HRexercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //java output formatting
        //input string (max of 10 characters) followed by integer (max 999)


//        System.out.println("================================");
//        for (int i = 0; i < 3; i++) {
//            String s1 = sc.next();
//            int x = sc.nextInt();
//            System.out.printf("%-15s%03d\n", s1, x);
//        }
//        System.out.println("================================");

    //Java Loops 1
    //Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

//        int N = sc.nextInt();
//        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        for (int i = 1; i <= 10; i++){
//            int ans = N * i;
//            System.out.printf("%d x %d = %d\n", N, i, ans);
//        }
//        sc.close();

    //java loops 2
    Scanner in = new Scanner(System.in);
//    System.out.println("Enter three integers");
    int t=in.nextInt();
        for(int i=0;i<t;i++){
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        for (int j = 0; j < n; j++){
            a += b;
            if (j > 0){
                System.out.print(" ");
            }
            System.out.print(a);
            b = b * 2;
        }
            System.out.println(" ");
    }
        in.close();

        //to do
//        System.out.println("Enter a number to see size");
//        t=sc.nextInt();


//        for(int k = 0; k < t; k++){
//        try
//        {
//            long x=sc.nextLong();
//            System.out.println(x+" can be fitted in:");
//            if(x>=-128 && x<=127)System.out.println("* byte");



//        }
//        catch(Exception e)
//        {
//            System.out.println(sc.next()+" can't be fitted anywhere.");
//        }
    }
}


