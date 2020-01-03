package grades;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        boolean flag = true;
        HashMap<String, Student> Students = new HashMap<>();
        Student bobby = new Student("Bobby");
        Student colin = new Student("Colin");
        Student roger = new Student("Roger");
        Student niloc = new Student("Niloc");

        bobby.addGrade(75);
        bobby.addGrade(80);
        bobby.addGrade(60);
        bobby.addGrade(70);

        colin.addGrade(97.5);
        colin.addGrade(98.11);
        colin.addGrade(100);
        colin.addGrade(92.7);

        roger.addGrade(90);
        roger.addGrade(93.55);
        roger.addGrade(65);
        roger.addGrade(100);

        niloc.addGrade(57.9);
        niloc.addGrade(11.89);
        niloc.addGrade(1);
        niloc.addGrade(72.9);

        Students.put("bobby-mcfly", bobby);
        Students.put("colinmarchbanks", colin);
        Students.put("roger-mayer", roger);
        Students.put("sknabhcramniloc", niloc);

        System.out.println("Welcome\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        for (HashMap.Entry<String, Student> entry : Students.entrySet()) {
            System.out.print("| " + entry.getKey() + " ");
        }
        System.out.print("|\n\n");


        System.out.println(" ");
        while (flag == true) {
            System.out.println("What student would you like to see more information on?\n");
            String userInput = scanner.nextLine();
            Student selectedStudent = null;
            String selectedStudentUserName = "";
            for (HashMap.Entry<String, Student> entry : Students.entrySet()) {
                if (userInput.equalsIgnoreCase(entry.getKey())) {
                    selectedStudent = entry.getValue();
                    selectedStudentUserName = entry.getKey();
                }
            }
            if (selectedStudent == null) {
                System.out.printf("Sorry, %s is not a valid option", userInput);
            } else {
                System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average: %s%n%n", selectedStudent.getName(), selectedStudentUserName, df.format(selectedStudent.getGradeAverage()));

            }
            System.out.println("Would you like to see another student? y/n");
            String userInput2 = scanner.nextLine();
            if (!userInput2.equalsIgnoreCase("y")) {
                flag = false;
            }
        }
            System.out.println("Goodbye, and have a wonderful day!");
        }

    }
