package codeup;

public class CodeupStudent extends Student {
    public CodeupStudent(String[] information, boolean graduated) {
        this.firstName = information[0];
        this.lastName = information[1];
        this.cohort = information[2];
        this.computer = information[3];
        this.graduated = graduated;

    }

    @Override
    public void greeting() {
        System.out.println("Hello " + cohort);
    }

    @Override
    public void study() {
        System.out.println("Full-Stack Java");

    }

    @Override
    public boolean giveCard() {
        if (graduated) {
            return true;
        } else {
            return false;
        }
    }
}