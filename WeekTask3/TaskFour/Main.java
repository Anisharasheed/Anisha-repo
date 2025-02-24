package Task1;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileHandler.ensureFile("numbers.txt", "-1 -5 -10");
        FileHandler.ensureFile("empty.txt", "");

        ExceptionDemo.tryCatchExample();
        NumberValidator.checkEven(5);
        FileHandler.verifyFile("data.txt");
        NumberValidator.validateNumbers("numbers.txt");
        FileValidator.validateEmptyFile("empty.txt");
    }
}

