package hackerrank;

public class ClassPractice {
    public static void main(String[] args) {
        System.out.println("working");
    }

    //write a method to return a double that calculates parameter 1 to exponent of param 2
    public static double warmup (double base, double exponent){


        double bucket = base;
        for (int i = 1; i <= exponent; i++){
            bucket += (base*bucket);
        }
        return bucket;
    }
}
