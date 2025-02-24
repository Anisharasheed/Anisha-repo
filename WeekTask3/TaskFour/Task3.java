package Task1;
import java.io.File;
import java.util.Scanner;

public class NumberValidator {
    public static void checkEven(int num) {
        try {
            if (num % 2 != 0) throw new Exception("Number is odd");
            System.out.println("Number is even");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
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
}
