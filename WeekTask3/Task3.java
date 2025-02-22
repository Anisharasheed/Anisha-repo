package Task1;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileProcessor {
    public static void main(String[] args) {
        String myFile = "data.txt";
        File file = new File(myFile);
        ensureFileExists(file);
        
        File directory = new File("./");
        System.out.println("Path: " + file.getAbsolutePath());
        
        displayFiles(directory);
        filterFilesByExtension(directory, "log");
        verifyPath(myFile);
        checkAccess(myFile);
        identifyFileType(myFile);
        retrieveLastModified(myFile);
        getInputFromUser();
        calculateFileSize(myFile);
        loadFileToByteArray(myFile);
        processFileLineByLine(myFile);
        fetchCompleteFile(myFile);
    }

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

    public static void displayFiles(File dir) {
        Optional.ofNullable(dir.list()).ifPresent(list -> Arrays.stream(list).forEach(System.out::println));
    }

    public static void filterFilesByExtension(File dir, String ext) {
        Optional.ofNullable(dir.listFiles((d, name) -> name.endsWith("." + ext)))
                .ifPresent(list -> Arrays.stream(list).map(File::getName).forEach(System.out::println));
    }

    public static void verifyPath(String path) {
        File file = new File(path);
        System.out.println(file.exists() ? "File found" : "File missing");
    }

    public static void checkAccess(String path) {
        File file = new File(path);
        System.out.println("Readable: " + file.canRead() + ", Writable: " + file.canWrite());
    }

    public static void identifyFileType(String path) {
        File file = new File(path);
        System.out.println(file.isDirectory() ? "Folder" : file.isFile() ? "Regular file" : "Unknown type");
    }

    public static void retrieveLastModified(String path) {
        System.out.println("Modified On: " + new Date(new File(path).lastModified()));
    }

    public static void getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Input: " + scanner.nextLine());
    }

    public static void calculateFileSize(String path) {
        File file = new File(path);
        System.out.println(file.exists() ? "File size: " + file.length() + " bytes" : "Size unavailable");
    }

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
