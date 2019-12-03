public class Employee extends Person {

    public Employee(String employeeName){
        super(employeeName);
    }

    public void doWork(){
        System.out.println("Working...");
    }

    public final double doPayroll(){
        return 4000.60;
    }

    @Override
    public void sayHello(){
        System.out.println("How can I help you?");
    }

}