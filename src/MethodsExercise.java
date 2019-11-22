

public class MethodsExercise {
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

    public static int getInteger(int min, int max){
           //need return statement
    }

    public static void main(String[] args) {

        System.out.println(add(6,3));
        System.out.println(subtract(6,3));
        System.out.println(multiply(6,3));
        System.out.println(divide(6,3));
        System.out.println(mod(6,3));

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);



    }
}
