import java.util.Random;
import java.util.Scanner;

public class consoleGame {

    static int badGuyHealth = 400;
    static int userHealth = 400;
    static  Scanner scanner = new Scanner(System.in);
    static String playAgain = "yes";

    public static void main(String[] args) {
        setup();
        fight();
    }

    public static void setup() {


        System.out.println("What's your name?");
        String userName = scanner.next();
        Random rando = new Random();
        System.out.println("Enemy Health= " + badGuyHealth);
        System.out.println(userName + "'s health= " + userHealth);
    }

    public static void fight(){
//        String playAgain = "yes";
        do {
            Random rando = new Random();
            Scanner scanner = new Scanner(System.in);
            int numberRandom = rando.nextInt(2);
            int attack = rando.nextInt(200);
            System.out.println("Choose your attack");
            System.out.println("Attack 1 or 2");
            int coinFlip = scanner.nextInt();
            if (coinFlip == numberRandom & userHealth > 0 & badGuyHealth > 0) {
                System.out.println("Great shot! Your attack does " + attack + " damage\n");
                badGuyHealth -= attack;
                System.out.println("bad guy has " + badGuyHealth + " health\n");

            } else {
                System.out.println("You missed!\n");
                System.out.println("Enemy attacks and does " + attack + " damage");
                userHealth -= attack;

                System.out.println("Your health= " + userHealth);
            }
            if (userHealth <= 0) {
                System.out.println("Game Over!!!");
                userHealth = 400;
                badGuyHealth = 400;
                System.out.println("would you like to play again\n");
                playAgain = scanner.next();
            }
            if (badGuyHealth <= 0) {
                System.out.println("You WON!!!");
                userHealth = 400;
                badGuyHealth = 400;
                System.out.println("would you like to play again\n");
                playAgain = scanner.next();
            }
        } while(playAgain.equalsIgnoreCase("yes"));


    }
}