import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //while loop to count from 5 to 15
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
//
//
//        //do while count by 2's from 0 to 100
//        int x = 0;
//        do {
//            System.out.println(x);
//            x += 2;
//        } while (x <= 100);
//
//        //do while subtract by 5 from 100 to -10
//        int fives = 100;
//        do {
//            System.out.println(fives);
//            fives -= 5;
//        } while (fives >= -10);

        // do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        long squares = 2L;
        do {
            System.out.println(squares);
            squares *= squares;
        } while (squares <= 1000000);


//        //for loop to count by 2's from 0 to 100
//        for(int z = 0; z <= 100; z++) {
//            if (e % 2 == 1){
//                continue;
//          }
//            System.out.println(z);
//        }

//        //for loop subtract by 5 from 100 to -10
//        for(int k = 100; k >= -10; k-=5) {
//            System.out.println(num);
//        }
//


         for (int i = 0; i <= 100; i++){
             if (i % 15 == 0){
                 System.out.println(i + " FizzBuzz");
             }
             else if (i % 3 == 0) {
                 System.out.println(i + " Fizz");
             }
             else if (i % 5 == 0){
                 System.out.println(i + " Buzz");
             }
             else {
                 System.out.println(i);
             }
             }



        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
//        int input = Integer.parseInt(scanner.next());
        //or
        int input = scanner.nextInt();


        System.out.print("here is your table! \n");
        System.out.print("number | squared | cubed\n");
        System.out.print("------ | ------- | -----\n");
        for(int j = 1; j <= input; j++) {

            System.out.printf("%d      | %2d      | %2d       \n", j,j*j,j*j*j);
        }


//        scanner.nextLine();
        System.out.println("Would you like to see your grades?");
        String confirm = scanner.next();

    while(confirm.equalsIgnoreCase("yes")){
        System.out.print("what is your grade: ");
        int grade = scanner.nextInt();
        char letterGrade;
        if (grade >90) {
                letterGrade = 'A';
            } else if (grade >80) {
                letterGrade = 'B';
            } else if (grade >70) {
                letterGrade = 'C';
            }  else {
                letterGrade = 'F';
            }
            System.out.printf("%d is an %c\n", grade, letterGrade);

        }
        System.out.println("Would you like to see your grades?");
        confirm = scanner.next();
    }
}
