class Person {

    public String firstName;
    public String lastName;
    public static boolean liveOnEarth = true;
    public static long worldPopulation = 7_500_000_000L;
    private String ssn;
    public String docs;

    //Create Person class inside of src that has a private name property
    //that is a string, and the following methods:
    private String name;

    // returns the person's name
    public String getName(){
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() { System.out.println("hello " + name); }


    public Person(String name){
        setName(name);
    }

    public static void main(String[] args) {
//        Person person = new Person("Roger");
//        person.sayHello();
//        person.setName("Katie");
//        System.out.println(person.name);
//        System.out.println(person.getName());
//        System.out.println(person.name);
//        Person person1 = new Person("Riley");
//        Person person2 = new Person("Riley");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1.getName() == person2.getName());
//        Person person1 = new Person("Riley");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        Person person1 = new Person("Riley");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Asher");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }



}
