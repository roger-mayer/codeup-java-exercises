package javaExercises;
import java.util.*;
import java.io.*;

public class MorningWarmup {
//return a string reversed
    public static String FirstReverse(String str){
        String[] strBroken = str.split("");
        String result = "";
        for (int i = str.length()-1; i >= 0; i--){
            result += strBroken[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner s = new Scanner(System.in);
        System.out.println(FirstReverse(s.nextLine()));
    }
}
