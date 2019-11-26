//package oop;
public class PersonLec {
    public String firstName;
    public String lastName;
    public static boolean liveOnEarth = true;
    public static long worldPopulation = 7_500_000_000L;
    private String ssn;


    public PersonLec(String firstNameExternal, String lastNameExternal, String ssnExt) {
            this.firstName = firstNameExternal;
            this.lastName = lastNameExternal;
            this.ssn = ssnExt;
            this.worldPopulation++;
        }

    public PersonLec(String firstName, String lastName) {

        }

        public String sayHello () {
            return String.format("Hello from %s %s!", this.firstName, this.lastName);
        }
        public static String breathe (String oxygen){
            return "CO2";
        }

//     Getter
        public String getSsn () {
            System.out.println("Auth process");
            System.out.println("Verification process");
            System.out.println("email confirmation process");
            return this.ssn;
        }

        public void provideDocs (String docs,double price){
            if (docs.equals("birthCertificate")) {
                this.makePayment(price);
            } else {
                System.out.println("Call security");
            }
        }

        private void makePayment ( double money){
            System.out.println(this.firstName + " Paid: $" + money);
        }

    }
//    <---constructor--->
//    public Person(String firstNameExternal, String lastNameExternal, String ssnExt){
//        this.firstName = firstNameExternal;
//        this.lastName = lastNameExternal;
//        this.ssn = ssnExt;
//        this.worldPopulation++;
//    }
//
//
////getter
//    public String getSsn(){
//        System.out.println("Auth process");
//        System.out.println("confirmation");
//        return this.ssn;
//    }
//
//    public void provideDocs (String Docs, double price){
//        if (docs.equals("birthCertificate")){
//            System.out.println(this.firstName + "paid $" + price);
//        } else {
//            System.out.println("");
//        }
//    }
//    private void makePayment(double money){
//        System.out.println("paid " + money);
//    }

