import java.util.Random;
import java.util.Scanner;

public class consoleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String userName = scanner.next();
        System.out.println(userName + "," + " Do you want to play a game?\n");
        String startAnswer = scanner.next();

        String playAgain = "yes";

//            if (startAnswer.equals("yes")) {
//                System.out.println("Like you had a choice!\n");
//            } else if (startAnswer.equals("no")) {
//                System.out.println("too bad, we are playing anyways...\n");
//            }
            Random rando = new Random();

//            int userAttackTwo = rando.nextInt(300);
            int badGuyHealth = rando.nextInt(400);
            int userHealth = rando.nextInt(400);
            int numberRandom = rando.nextInt(2);

            System.out.println("Enemy Health= "+ badGuyHealth);
            System.out.println(userName + "'s health= "+ userHealth);
        do {
            int userAttack = rando.nextInt(200);
            int badGuyAttack = rando.nextInt(200);
            System.out.println("attack 1 or 2");

            int attack = scanner.nextInt();
            if (attack == numberRandom & userHealth > 0 & badGuyHealth > 0){
                System.out.println("Great shot! Your punch does " + userAttack + " damage\n");
                badGuyHealth -= userAttack;
                System.out.println("bad guy has " + badGuyHealth + " health\n");

            } else {
                System.out.println("you missed!\n");
                System.out.println("Enemy attacks and does " + badGuyAttack + " damage");
               userHealth -= badGuyAttack;

                System.out.println(userName + "'s health= " + userHealth);
            }




            if (userHealth == 0) {
                System.out.println("Game Over!!!");
                System.out.println("would you like to play again\n");
                playAgain = scanner.next();
            }
            if (badGuyHealth == 0){
                System.out.println("You WON!!!");
                System.out.println("would you like to play again\n");
                playAgain = scanner.next();

            }
        } while (playAgain.equalsIgnoreCase("yes"));
    }

}
