package ExecptionsPKG;

//test review
public class hospital {
    public static void main(String[] args){

        try {
            makeApt(null);
            makeApt("2019-12-11");
        } catch (Exception e) {
            e.printStackTrace();
            //handle: write in log, send email, try again

        }


    }

    private static void makeApt(String date) throws Exception{
        if(date == null){
            throw new Exception("Invalid input");
        }

    }
}
