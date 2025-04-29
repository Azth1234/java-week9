import java.io.*; 

public class readFile {

    // Method to read a file
    public static void findFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

        if (!file.exists()) {
            // if the file is missing
            throw new FileNotFoundException("File not found: " + fileName);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Reading file contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Catch any other IO problems (like read errors)
            System.out.println("Error while reading the file: " + e.getMessage());
        }
    }

    // Main method to test our super cool method
    public static void main(String[] args) {
        String fileName = "example.txt"; // Replace with your file name!

        try {
            findFile(fileName);
        } catch (FileNotFoundException e) {
            // Handle our custom tantrum here
            System.out.println("Exception caught=> " + e.getMessage());
        }
    }
}
