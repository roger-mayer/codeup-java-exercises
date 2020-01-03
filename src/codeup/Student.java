package codeup;

abstract class Student {
    protected String firstName;
    protected String lastName;
    protected String cohort;
    protected String computer;
    protected Boolean graduated;

    public abstract void greeting();
    public abstract void study();
    public abstract boolean giveCard();


}
