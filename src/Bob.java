import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Would you like to ask Bob something");

        String confirm = sc.next();

while(confirm.equalsIgnoreCase("yes")){
    System.out.println("Fire away");
    String input = sc.next();

    if (input.endsWith("?")) {
        System.out.println("Sure");
    } else if (input.endsWith("!")) {
        System.out.println("Whoa chill out");
    } else if (input.trim().equals("")) {
        System.out.println("Fine be that way");
    } else {
        System.out.println("Whatever");
    }

    System.out.println("Would you like to ask Bob something else");
    confirm = sc.next();
    }
    }
}
