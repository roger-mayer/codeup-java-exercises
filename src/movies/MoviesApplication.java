package movies;
import java.util.Arrays;
import java.util.Scanner;
import util.Input;
public class MoviesApplication {
    public static void main(String[] args) {
        Input in = new Input();
        Movie[] newMovies = MoviesArray.findAll();
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        int userInput = in.getInt(0,5);

       while (true){
            if (userInput == 0){
                System.out.println("See you later");
                System.exit(0);
            }
            if (userInput == 1){
                System.out.println("Here are all the movies");
                for(Movie movie : newMovies ) {
//                    System.out.println(Arrays.toString(newMovies));
                    System.out.println(movie.getName());
                }
            }
            if (userInput == 2){
                System.out.println("Here are all the animated movies");
            }
            if (userInput == 3){
                System.out.println("Here are all the drama movies");
            }
            if (userInput == 4){
                System.out.println("Here are all the horror movies");
            }
            if (userInput == 5){
                System.out.println("Here are all the scifi movies");
            }
            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");
            userInput = in.getInt(0,5);
        }

    }

}
