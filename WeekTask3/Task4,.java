package Task1;
import java.io.*;
import java.nio.file.*;
import java.util.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        ensureFile("numbers.txt", "-1 -5 -10");
        ensureFile("empty.txt", "");

        tryCatchExample();
        checkEven(5);
        verifyFile("data.txt");
        validateNumbers("numbers.txt");
        validateEmptyFile("empty.txt");
    }

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

    public static void tryCatchExample() {
        try {
            throw new Exception("Manual exception thrown");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void checkEven(int num) {
        try {
            if (num % 2 != 0) throw new Exception("Number is odd");
            System.out.println("Number is even");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void verifyFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found: " + filename);
        }
    }

    public static void validateNumbers(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found: " + filename);
            return;
        }
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                if (scanner.nextInt() > 0) {
                    System.out.println("Positive number found");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void validateEmptyFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found: " + filename);
        } else if (file.length() == 0) {
            System.out.println("File is empty");
        }
    }
}
