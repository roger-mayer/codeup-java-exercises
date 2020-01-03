package FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroceryApp {

    final static String folder = "data";
    final static String fileName = "phone.txt";

    // CRUD app
    public static void main(String[] args) {

        Path dataDirectory = Paths.get(folder);
        Path dataFile = Paths.get(folder, fileName);
        List<String> contactList = Arrays.asList("Roger", "Nico", "Fer", "Sophie");

        try{

            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

            Path filepath = Paths.get("data", "phone.txt");

            //
            Files.write(filepath, contactList);

            Files.write(
                    filepath,
                    Arrays.asList("eggs"), // list with one item
                    StandardOpenOption.APPEND
            );

            List<String> newContactList = Files.readAllLines(filepath);

            for (int i = 0; i < newContactList.size(); i += 1) {
                System.out.println((i + 1) + ": " + newContactList.get(i));
            }

            List<String> tempList = new ArrayList<>();
            for (String contact : newContactList) {

                // Update cream instead of milk
                if (contact.equals("milk")) {
                    tempList.add("cream");
                    continue;
                }

                // Delete contact
                if(contact.equals("fer")){
                    continue;
                }

                // An item is being added
                tempList.add(contact);
            }

            // Writes the file with the final tempList
            Files.write(filepath, tempList);

        }catch (IOException ex){
            ex.printStackTrace();
        }


    }

}