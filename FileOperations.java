import java.io.*;

class FileOperations {
    public static void main(String[] args) throws Exception {

        // Create
        File file = new File("student.txt");
        file.createNewFile();
        System.out.println("File created successfully.");

        // Open and Write
        FileWriter fw = new FileWriter(file);
        fw.write("Welcome to Java File Handling");
        fw.close();

        // Open and Read
        FileReader fr = new FileReader(file);
        int ch;

        System.out.println("File contents:");
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        // Close
        fr.close();
        System.out.println("\nFile closed successfully.");
    }
}
