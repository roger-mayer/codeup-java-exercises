public final class Password {

    private static String plainTextPass;

    public Password(String plainTextPass) {
        this.plainTextPass = "0" + plainTextPass + "1";
    }

    public static boolean checkPass(String pass){
        return plainTextPass.equals("0pass1");
    }
}