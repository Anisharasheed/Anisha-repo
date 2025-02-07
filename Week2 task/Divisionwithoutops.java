package Oops;
import java.util.Scanner;
public class divide  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the numerator: ");
        int numerator = sc.nextInt();
        
        System.out.print("Enter the denominator: ");
        int denominator = sc.nextInt();
        
        int quotient = 0;
        int remainder = numerator;
        
        while (remainder >= denominator) {
            remainder = remainder - denominator;
            quotient = quotient + 1;
        }

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        
        sc.close();
    }
}

