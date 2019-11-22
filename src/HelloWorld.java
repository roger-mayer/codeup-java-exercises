import java.sql.SQLOutput;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        String hello = "Hello World";
        System.out.println(hello);

        byte aNumber = 100;
        short age = 29000 + 100;
        int secondNumber = age + aNumber;
        long account = 2343242344564646324L;

        float price = 4.5f;
        double priceWithDiscount = price - 1.0f;

        char dollarSign = '$';
        char gender = 'M';

        float res = (5 / 6);

        boolean zachIsTheRoom = (aNumber == 100);
        final String nameL = "fernando";
//        nameL = "Luis";
        System.out.print(nameL);
        System.out.println(nameL);

//        Binary expression
        System.out.println("aNumber = " + (aNumber + 2));

        //        Binary expression
//        aNumber++;
        System.out.println("aNumber = " + ++aNumber);

        //        Input from the terminal
        double pi = 3.14159;
        byte almostPi = (byte) pi;
        System.out.println("pi = " + pi);
        System.out.println("almostPi = " + almostPi);

        //        Simulate a HTTP request
        String ageParameter = "29";
        Integer anotherNumber = 5;

        anotherNumber.byteValue();
        byte realAge = (byte) (Integer.parseInt(ageParameter) + 1);
        System.out.println("realAge = " + realAge);

//Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 11;
        System.out.println(myFavoriteNumber);
//Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "String";
        System.out.println(myString);
//Change your code to assign a character value to myString. What do you notice?
//        char myStringChar = (char) myString; CANNOT CONVERT

//        Change your code to assign the value 3.14159 to myString. What happens?
//        String myString = 3.14159; //cannot convert string to number

//Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber;
//        System.out.println(myNumber);  //variable not initialized. to much space. use byte

//Change your code to assign the value 3.14 to myNumber. What do you notice?
//        long myNumber = 3.14;
//        System.out.println(myNumber); //incompatible types


//Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        long myNumber = 123L;
//        System.out.println(myNumber); //cannot resolve L

//Change your code to assign the value 123 to myNumber.
//        long myNumber = 123;
//        System.out.println(myNumber); //123

//Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens?
        //change from float to double
//        double myNumberFloat = 3.14;
//        System.out.println(myNumberFloat); //3.14
//        int myNumberFloatInt = (int) myNumberFloat;
//        System.out.println(myNumberFloatInt); //3
//        Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//exetute following code
//        int x = 5;
//        System.out.println(x++); //5
//        System.out.println(x); //6
//
//        int x = 5;
//        System.out.println(++x); //6
//        System.out.println(x); //6


//Object datatype
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three"; //inconvertable type
//        System.out.println(three);

//        Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        //x = x + 5;
//        x +=5;

//        int x = 3;
//        int y = 4;
//        y = y * x;
//
//        int x = 10;
//        int y = 2;
//        //x = x / y; converts to:
//        x /= y

//        //y = y - x; converts to:
//        y -= x;

//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?


//Accept and print user name
        Scanner userInput = new Scanner(System.in); //create object of scanner class
        System.out.println("Enter your name: ");
        String user = userInput.nextLine(); //read user input

        System.out.print("You entered: " + user);
        System.out.print("\n");

//        Write a Java program to convert seconds to hour, minute and seconds.
        Scanner in = new Scanner(System.in); //create object of scanner class
        System.out.print("Input seconds: "); //enter seconds
        int seconds = in.nextInt(); //set input val to seconds variable
        int p1 = seconds % 60; // get remainder of seconds
        int p2 = seconds / 60; // get minutes
        int p3 = p2 % 60; //get remainder of minutes from hours/minutes
        p2 = p2 / 60; //get total hours (seconds divided by 60 then divided by 60)
        System.out.print( p2 + ":" + p3 + ":" + p1);
        System.out.print("\n");



    }

}
