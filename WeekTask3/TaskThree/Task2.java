package Task1;
import java.io.File;
import java.util.Date;

public class FileInfo {
    public static void displayPath(File file) {
        System.out.println("Path: " + file.getAbsolutePath());
    }

    public static void identifyFileType(String path) {
        File file = new File(path);
        System.out.println(file.isDirectory() ? "Folder" : file.isFile() ? "Regular file" : "Unknown type");
    }

    public static void retrieveLastModified(String path) {
        System.out.println("Modified On: " + new Date(new File(path).lastModified()));
    }

    public static void calculateFileSize(String path) {
        File file = new File(path);
        System.out.println(file.exists() ? "File size: " + file.length() + " bytes" : "Size unavailable");
    }
}
