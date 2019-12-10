package Execptions;
import util.Input;

public class Exceptions {

    static Input input = new Input();

    public static void main(String[] args) throws Exception, IndexOutOfBoundsException {


        String indentationPreference;

        try {
            indentationPreference = getIndentationPreference();
            System.out.println("Okay, " + indentationPreference + " is a great choice.");
        } catch (WrongIndentationTypeException e) {
            System.out.println("Uh oh, something went wrong: " + e.getMessage());
            System.out.println("Here is some more detail:");
            e.printStackTrace();
        }

        int[] numbers = {1, 2, 3};
        boolean transferComplete = false;

        try{
            System.out.println(numbers[input.getInt()]);
            transferComplete = true;
        } catch (ArrayIndexOutOfBoundsException e){
            // Dev feedback
            e.printStackTrace();
//            System.out.println("e.getMessage() = " + e.getMessage());

            //What do I do to solve the problem or give the user options
            System.out.println("The size is smaller than you think");

            // Setting rules on the business logic side
            throw new Exception("The size is smaller than you think");

        } finally {
            //  Always runs and it's also related to the main try purpose
            System.out.println("Verify funds");
        }

        System.out.println("Check my email");

        System.out.println("transferComplete = " + transferComplete);
    }


    public static String getIndentationPreference() throws WrongIndentationTypeException {
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = input.getString();

        if (indentationPreference.equals("tabs")) {
            throw new WrongIndentationTypeException("Spaces are superior!");

        }

        return indentationPreference;
    }



}

