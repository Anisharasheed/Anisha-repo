package Task1;
import java.util.Scanner;

public class Employee {
    int id;
    String name;
    double salary;
    int exp;

   
    public void setDetails() {
        Scanner s = new Scanner(System.in);
        System.out.print("ID: ");
        id = s.nextInt();
        s.nextLine(); 
        System.out.print("Name: ");
        name = s.nextLine();
        System.out.print("Salary: ");
        salary = s.nextDouble();
        System.out.print("Experience: ");
        exp = s.nextInt();
    }

  
    public void getDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + exp + " years");
    }

 
    public void checkLoan() {
        if (exp <= 5) {
            System.out.println("No Loan Eligibility");
            return;
        }

        double annual = salary * 12;
        double loan = 0;

        if (annual >= 1500000) {
            loan = 700000;
        } else if (annual >= 1000000) {
            loan = 500000;
        } else if (annual >= 600000) {
            loan = 200000;
        }

        if (loan > 0) {
            System.out.println("Eligible for Loan: ₹" + loan);
        } else {
            System.out.println("No Loan Eligibility");
        }
    }
}
