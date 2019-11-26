public class OopImplementation {
    public static void main(String[] args) {
        PersonLec rick = new PersonLec("Rick", "Sanchez", "123-45-6789");
        System.out.println(rick.sayHello());
        // prints "Hello from Rick Sanchez!"

        PersonLec roger = new PersonLec("Roger", "Mayer", "123-45-6789");
        PersonLec riley = new PersonLec("Riley", "Mayer", "123-45-6789");

//        <---added constructor in person.java--->
        riley.firstName = "Riley";
        roger.lastName = "Mayer";

        roger.provideDocs("birthCertificate", 100);
    }

}
