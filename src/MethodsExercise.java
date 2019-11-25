import java.util.Random;
import java.util.Scanner;

public class MethodsExercise {


    public static int addition(int one, int two) {
        return one + two;
        }
        public static int subtraction(int one, int two) {
        return one - two;
        }
        public static int multiplication(int one, int two) {
            int newOne = 0;
            for (int i = 0; i < two; i++) {
                newOne += one;
            }
            return newOne;

        }

    public static long recursionMult(int one, int two) {
        if (two == 0) {
            return 0;
        } else if (two == 1) {
            return one;
        } else if (two == 2) {
            return one + one;
        }
        return one + recursionMult(one, two - 1);
    }
//    public static void count(int one, int two) {
//        if (two == 0) {
//            System.out.println("All done!");
//            return;
//        }
//        int newOne = 0;
//        System.out.println(newOne);
//            count(newOne += one);
//    }
//
//    public static void main(String[] args) {
//        count(one);
//    }

        public static int division(int one, int two) {
        return one/two;
        }
        public static int modulo(int one, int two) {
        return one % two;
        }


        public static int getInteger(int min, int max) {
            System.out.println("Please enter a number between 1 and 10");
            Scanner scanner = new Scanner(System.in);
            int newInput = scanner.nextInt();
            do {
                if (newInput < max && newInput > min) {
                    System.out.println("Great! " + newInput + " is in range!");
                    continue;
                } else {
                    System.out.println("That's not a number between 1 and 10.");
                } newInput = scanner.nextInt();

            } while (newInput > max || newInput < min);
            return newInput;
        }

        public static Integer factorialMaker() {
            System.out.println("Please enter an integer between 1 and 10");
            Scanner scanner = new Scanner(System.in);
            int newInput = scanner.nextInt();
            System.out.println(newInput);
            if (newInput < 10 && newInput > 0) {
                System.out.println("Do you want to continue?");
                String newNewInput = scanner.nextLine();
                if (newNewInput.equalsIgnoreCase("yes")) {
                    for (int i = newInput -1; i > 0; i--) {
                        newInput *= (i);
                    }
                }
            } else {
                return factorialMaker();
            }
            return newInput;
        }

    static Scanner scanner = new Scanner(System.in);
    public static void dice() {
        System.out.println("Please enter how many sides are on your dice.");
        int diceSides = scanner.nextInt();
        System.out.println("Your dice has " + diceSides + " sides");

//        System.out.println("Would you like to roll? yes or no");
//        String roll = scanner.next();
        String rollAgain = "yes";
        do {
            Random diceRoll = new Random();
            int newDiceRoll = diceRoll.nextInt(diceSides - 1) + 1;
            System.out.println("Your rolled a " + newDiceRoll);
            System.out.println("Would you like to roll? yes or no");
            rollAgain = scanner.next();

        }
            while (rollAgain.equalsIgnoreCase("yes")) ;
            System.out.println("Thanks for playing");
        }



//    public static void highLow() {
//        int gameNum = (int)(10.0 * Math.random());
//        System.out.println(gameNum);
//        System.out.println("Would you like to roll again");


    //game





//    }

    public static void main(String[] args){
//        System.out.println(addition(1,1));
//            System.out.println(subtraction(4,1));
//            System.out.println(multiplication(3,4));
//            System.out.println(division(4,2));
//            System.out.println(modulo(4,3));
//            System.out.println(getInteger(1, 10));
//                System.out.println(recursionMult(4, 10));
//              System.out.println(factorialMaker());
                dice();
//                highLow();

    }

}