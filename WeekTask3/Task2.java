package Task1;
import java.util.*;

public class Employee {
	
	    int id;
	    String name;
	    double salary;
	    int exp;

	    void setDetails() {
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

	    void getDetails() {
	        System.out.println(id + " " + name + " " + salary + " " + exp);
	    }

	    void checkLoan() {
	        if (exp <= 5) {
	            System.out.println("No Loan");
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
	            System.out.println("Loan: " + loan);
	        } else {
	            System.out.println("No Loan");
	        }
	    }

	    public static void main(String[] args) {
	        Employee e = new Employee();
	        e.setDetails();
	        e.getDetails();
	        e.checkLoan();
	    }
	}

