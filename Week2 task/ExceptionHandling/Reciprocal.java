package Arithmeticexception;
import java.util.Scanner;

public class Students {
    public static void processInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            double reciprocal = 1 / number;
            System.out.println("Reciprocal: " + reciprocal);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a numerical value.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        processInput();
    }
}
