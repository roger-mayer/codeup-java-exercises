package hackerrank;

public class Person {   //class used to define blueprint for objects that will be created
    public String firstName; //instance variable that belongs to class (or object
    public String lastName;

    public String sayHello() { //instance method
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) { //instance of Person class
        Person rick = new Person(); //define variable
        rick.firstName = "Rick"; //assign values to object fields with .properties
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello()); //call say hello method
        // prints "Hello from Rick Sanchez!"
    }
}
