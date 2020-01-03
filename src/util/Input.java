package util;
import java.util.Scanner;

public class Input extends Exception {
    private Scanner sc = new Scanner(System.in);

    public String getString() {
        return sc.next();


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

    public int getInt(int min, int max) {
        System.out.println("Enter a number: ");
        int num = Integer.valueOf(getString());
        try {
            if (num < min || num > max)
                return getInt(min, max);
            } catch(Exception e){
                System.out.println(num + "is not a valid input");
                getInt(min, max);
            }
                System.out.print("Your number is: ");
                return num;
        }


    public int getInt(){
        System.out.println("enter number");
        System.out.print("Your number is: ");
        return Integer.parseInt(getString());
    }

    public double getDouble(double min, double max){
        System.out.printf("Give me a number between %f and %f\n", min, max);
        double num = Double.valueOf(getString());
        try {
            if (num < min || num > max)
                return getDouble(min, max);
        } catch(Exception e){
            System.out.printf("%f is not a valid input", num);
            getDouble(min, max);
        }
        System.out.printf("Your number is %f");
        return num;
    }


    public double getDouble (){
            System.out.println("Enter a number");
            return Double.parseDouble(getString());

    }
}