import java.util.Random;
import java.util.Scanner;
public class MethodsExercise {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

//        boolean start = true;
//
//        System.out.println("sum(1,2) = " + sum(1, 2));
////        System.out.println(sum(1,2) == 3);
////        System.out.println(sum(-1,2) == 1);
//        System.out.println("sub(1,2) = " + sub(1, 2));
//        System.out.println("multiply(3,2) = " + multiply(3, 2));
//        System.out.println("division(5,2) = " + division(5, 2));
//        System.out.println("modulus(5,2) = " + modulus(5, 2));
//
//        System.out.print("Enter a number between 1 and 10: ");
//        System.out.println("userInput = " + getInteger(1, 10));
//
//        while(start){
//            System.out.println("calculateFactorial() = " + calculateFactorial());
//            System.out.println("Would you like to continue? (y/n)");
//            start = scan.nextLine().equalsIgnoreCase("y");
//        }

//        do {
//            System.out.println("Give me the number of sides");
//            rollDices(getInteger(1,100));
//            System.out.println("Would you like to continue? (y/n)");
//        } while (scan.nextLine().equalsIgnoreCase("y"));
        boolean start = true;

        System.out.println("sum(1,2) = " + sum(1, 2));
//        System.out.println(sum(1,2) == 3);
//        System.out.println(sum(-1,2) == 1);
        System.out.println("sub(1,2) = " + sub(1, 2));
        System.out.println("multiply(3,2) = " + multiply(3, 2));
        System.out.println("division(5,2) = " + division(5, 2));
        System.out.println("modulus(5,2) = " + modulus(5, 2));

        System.out.print("Enter a number between 1 and 10: ");
        System.out.println("userInput = " + getInteger(1, 10));

        while(start){
            System.out.println("calculateFactorial() = " + calculateFactorial());
            System.out.println("Would you like to continue? (y/n)");
            start = scan.nextLine().equalsIgnoreCase("y");
        }

        do {
            System.out.println("Give me the number of sides");
            rollDices(getInteger(1,100));
            System.out.println("Would you like to continue? (y/n)");
        } while (scan.nextLine().equalsIgnoreCase("y"));

        do {
            Random random = new Random();
            int winningNumber = random.nextInt(100) + 1;
            System.out.println("Give me a number to guess");
            guessGame( getInteger(1,100), winningNumber);
            System.out.println("Would you like to continue? (y/n)");
        } while (scan.nextLine().equalsIgnoreCase("y"));
    }
    public static double sum(double num, double num2){
        return num + num2;
    }
    public static double sub(double num, double num2){
        return num - num2;
    }
    public static double multiply(double num, double num2){
        return num * num2;
    }
    public static double division(double num, double num2){
        return num / num2;
    }
    public static double modulus(double num, double num2){
        return num % num2;
    }
    public static int getInteger(int min, int max){
        int input = Integer.parseInt(scan.nextLine());
        if(input < min){
            System.out.println("The number is lower than the min, try again: ");
            return getInteger(min, max);
        } else if(input > max) {
            System.out.println("The number is higher than the max, try again: ");
            return getInteger(min, max);
        }
        return input;
    }
    public static long calculateFactorial(){
        System.out.print("Enter a number between 1 and 10: ");
        int number = getInteger(1,10);
        // 4
        long output = 1;
        for (int counter = 1; counter <= number ; counter++){
            output *= counter;
        }
        return output;
    }
    public static void rollDices(int sides){
        // Create an instance of the Random class
        Random random = new Random();
        int random1 = random.nextInt(sides) + 1;
        int random2 = random.nextInt(sides) + 1;
        System.out.println("random1 = " + random1);
        System.out.println("random2 = " + random2);
    }
    public static void guessGame(int firstGuess, int winningNumber) {
        System.out.println("winningNumber = " + winningNumber);
        if(firstGuess == winningNumber){
            System.out.println("You won");
        } else if (firstGuess < winningNumber ){
            System.out.println("Go higher, try again: ");
            guessGame(getInteger(1, 100), winningNumber);
        } else {
            System.out.println("Go Lower, try again: ");
            guessGame(getInteger(1, 100), winningNumber);
        }
    }
}