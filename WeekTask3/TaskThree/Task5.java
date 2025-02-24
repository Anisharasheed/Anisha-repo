package Task1;
import java.util.Scanner;

public class UserInputHandler {
    public static void getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Input: " + scanner.nextLine());
    }
}
