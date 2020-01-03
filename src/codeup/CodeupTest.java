package codeup;

public class CodeupTest {
    public static void main(String[] args) {
       String[] student1 = {"Roger", "Mayer", "Diemos", "Macbook"};
       CodeupStudent roger = new CodeupStudent(student1, true);

       roger.greeting();
       roger.study();
        System.out.println(roger.giveCard());

    }
}
