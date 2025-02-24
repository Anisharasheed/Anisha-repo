package Task1;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandler {
    public static void ensureFile(String filename, String content) {
        File file = new File(filename);
        if (!file.exists()) {
            try (PrintWriter writer = new PrintWriter(file)) {
                writer.println(content);
                System.out.println("File created: " + filename);
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
            }
        }
    }

    public static void verifyFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found: " + filename);
        }
    }
}
