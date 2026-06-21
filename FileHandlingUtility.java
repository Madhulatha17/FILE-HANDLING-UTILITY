import java.io.*;

public class FileHandlingUtility {

    public static void main(String[] args) {

        String fileName = "sample.txt";

        try {

            FileWriter writer = new FileWriter(fileName);
            writer.write("Welcome to Java File Handling.\n");
            writer.write("This file demonstrates read, write, and modify operations.\n");
            writer.close();

            System.out.println("Data written successfully.");

            
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;

            System.out.println("\nReading File:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

            FileWriter modifier = new FileWriter(fileName, true);

            modifier.write("This line was added using modify operation.\n");

            modifier.close();

            System.out.println("\nFile modified successfully.");

            BufferedReader modifiedReader =
                    new BufferedReader(new FileReader(fileName));

            System.out.println("\nModified File Content:");

            while ((line = modifiedReader.readLine()) != null) {
                System.out.println(line);
            }

            modifiedReader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
