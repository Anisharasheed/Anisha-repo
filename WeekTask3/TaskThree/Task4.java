package Task1;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReaderUtil {
    public static void loadFileToByteArray(String path) {
        try {
            System.out.println("Bytes read: " + Files.readAllBytes(Paths.get(path)).length);
        } catch (IOException e) {
            System.out.println("Read failure");
        }
    }

    public static void processFileLineByLine(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Reading error");
        }
    }

    public static void fetchCompleteFile(String path) {
        try {
            System.out.println(new String(Files.readAllBytes(Paths.get(path))));
        } catch (IOException e) {
            System.out.println("Failed to read file");
        }
    }
}
