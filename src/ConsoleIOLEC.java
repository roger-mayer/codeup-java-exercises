import java.util.Scanner;

public class ConsoleIOLEC {
    public static void main(String[] args) {
        String name = "Roger";
        int favNum = 11;
        System.out.println("hello," + name);
        System.out.printf("hello %s, your favorite number is %d %n", name, favNum);
        // (%s = string) (%d = number) (%n =new line)

        //receiving input
        Scanner scanner = new Scanner(System.in);
        //prompt
        System.out.println("What is your favorite number?");
        String num = scanner.next(); //accepts one word

        System.out.printf("%s", num);

        scanner.nextLine();
        System.out.println("What is on your mind?");
        String input = scanner.nextLine(); //accepts one line

        System.out.printf("%s", input);
    }


}
