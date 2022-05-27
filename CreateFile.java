// Create a main function java

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File myObj = new File("test12.txt");
        try {
            myObj.createNewFile();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("File created!");
    }
}

