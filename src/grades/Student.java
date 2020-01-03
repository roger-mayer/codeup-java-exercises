package grades;
import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Create a class named Student.
public class Student {

// private properties for the Student's name, and grades.
    private static String name;
    private ArrayList<Double> grades;

// constructor that sets name property, and initializes the grades property as an empty ArrayList.
    public Student(String studentName) {
        this.name = studentName;
        this.grades = new ArrayList<>();

    }
    public static int add(int one, int two) {
        return (one + two);
    }

    public static int subtract(int one, int two) {
        return (one - two);
    }

    public static int multiply(int one, int two) {
        return (one * two);
    }

    public static int divide(int one, int two) {
        return (one / two);
    }

    public static int mod(int one, int two) {
        return (one % two);
    }

    // ===========   ex 2  ========//
    public static int getInteger() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("invalid input");
            return getInteger();
        }
    }


    public static int getInteger(int min, int max) {
        System.out.println("Please enter a number between " + min + " and " + max);
        int userInput = getInteger();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number out of range");
            return getInteger(min, max);
        }

    }
    // ===== Ex 3 =====//

    public static long calculateFactorial(int arg) {
        long output = 1;
        for (int i = 1; i <= arg; i += 1) {
            output += i;
        }
        return output;
    }



    // returns the student's name
    public String getName() {
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(double grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum =0;
        for (double grade: this.grades){
            sum += grade;
        } return sum / this.grades.size();
    }










    public static void main(String[] args) {
        Student roger = new Student("Roger");
        roger.addGrade(99);
        roger.addGrade(90);
        roger.addGrade(95);
        System.out.println(roger.getGradeAverage());


    }
}




