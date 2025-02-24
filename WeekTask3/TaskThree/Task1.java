package Task1;
import java.io.File;
import java.io.IOException;

public class FileHandler {
    public static void ensureFileExists(File file) {
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("New file created: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("Creation error: " + e.getMessage());
        }
    }

    public static void verifyPath(String path) {
        File file = new File(path);
        System.out.println(file.exists() ? "File found" : "File missing");
    }

    public static void checkAccess(String path) {
        File file = new File(path);
        System.out.println("Readable: " + file.canRead() + ", Writable: " + file.canWrite());
    }
}
