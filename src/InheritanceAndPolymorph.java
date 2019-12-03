public class InheritanceAndPolymorph {

    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        Person mom = new Person("Tomasa");
        mom.sayHello();
//        System.out.println("mom.hairColor = " + mom.hairColor);

        Employee fer = new Manager("Fer");
        fer.sayHello();
//        fer.setHairColor("blue");
//        System.out.println("fer.hairColor = " + fer.hairColor);

        Employee sophie = new Instructor("Sophie");
        sophie.sayHello();

        employees[0] = fer;
        employees[1] = sophie;

        for (int x= 0; x < employees.length; x++){
            employees[x].doWork();
        }



//        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");
//
//        System.out.println(theManOfSteel.getName()); // "Superman"
//
//        theManOfSteel.sayHello();
//        System.out.println(theManOfSteel.getSecretIdentity()); // "Clark Kent"








    }

}