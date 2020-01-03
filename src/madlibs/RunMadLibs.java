package madlibs;

public class RunMadLibs {
    public static void main(String[] args) {
        String [] words = {"Roger", "Blue", "Shirt", "The Shirt Store"};
        //constructor
        Version1 version1 = new Version1(words);

        System.out.println("There was a person named... ");
        System.out.println(version1.name);
        System.out.println(version1.goToLocation());
        System.out.println("He said...");
        System.out.println(version1.greeting());
        System.out.println("\"I would like to buy that \"");
        System.out.println(version1.color + " " + version1.randomObject);
        System.out.println(version1.pickUpObject());
        System.out.println("Then he left");
        System.out.println("*************************");

    }
}
