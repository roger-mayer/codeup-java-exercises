import java.util.Random;
public class ServerNameGenerator {
    public static String randomGen(String[] arrayName) {
        // Create a method that will return a random element from an array of strings.
        Random random = new Random();
        int arrayIndex = random.nextInt(arrayName.length);
        return arrayName[arrayIndex];
    }
// Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    public static void main(String[] args) {
        String[] adjs = new String[]{"rocking", "chubby", "lazy", "fast", "wet", "silly", "scruffy", "fancy", "great", "hairy"};
        String[] nouns = new String[]{"tiger", "bear", "robot", "baby", "snake", "tree", "racecar", "thunder", "fire", "smoke"};
        System.out.println(randomGen(adjs) + "-" +randomGen(nouns));
    }
}
