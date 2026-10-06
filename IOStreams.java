import java.io.*;

class IOStreams {
    public static void main(String[] args) throws Exception {

        // Output Stream - Write data
        FileOutputStream out = new FileOutputStream("student.txt");
        String data = "Welcome to Java IO Streams";
        out.write(data.getBytes());
        out.close();

        // Input Stream - Read data
        FileInputStream in = new FileInputStream("student.txt");
        int ch;

        System.out.println("File contents:");

        while ((ch = in.read()) != -1) {
            System.out.print((char) ch);
        }

        in.close();
    }
}
