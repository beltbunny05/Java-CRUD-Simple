import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class


public class WriteToFile {

    public static void main(String[] args) {
        try {
            FileWriter registrar = new FileWriter("filename.txt");
            //registrar.write();
            registrar.close();  // must close manually

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

