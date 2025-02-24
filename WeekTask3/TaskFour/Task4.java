package Task1;
import java.io.File;

public class FileValidator {
    public static void validateEmptyFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found: " + filename);
        } else if (file.length() == 0) {
            System.out.println("File is empty");
        }
    }
}
