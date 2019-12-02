package util;
import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter string");
        String input = sc.nextLine();
        return input;

    }
    public boolean yesNo(){
        sc.nextLine();
    System.out.println("Enter yes/no");
    String response = sc.nextLine();
    if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y") ||response.equalsIgnoreCase("yeah")){
        return true;
        } else {
        return false;
        }
    }

    public int getInt(int min, int max){
        System.out.printf("Give me a number between %d and %d\n", min, max);
        int input = Integer.parseInt(sc.nextLine());
        if(input < min){
            System.out.println("The number is lower than the min, try again: \n");
            return getInt(min, max);
        } else if(input > max) {
            System.out.println("The number is higher than the max, try again: \n");
            return getInt(min, max);
        }
        return input;
    }

    public int getInt(){
        System.out.println("Enter a number\n");
        int num = sc.nextInt();
        return num;
    }

    public double getDouble(double min, double max){
        System.out.printf("Give me a number between %f and %f\n", min, max);
        double input = Double.parseDouble(sc.next());
        if(input < min){
            System.out.println("The number is lower than the min, try again: \n");
            return getDouble(min, max);
        } else if(input > max) {
            System.out.println("The number is higher than the max, try again: \n");
            return getDouble(min, max);
        }
        return input;
    }

    public double getDouble (){
            System.out.println("Enter a number");
            double num = sc.nextDouble();
            return num;
    }




}