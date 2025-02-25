package Task1;
import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection conn = DatabaseConnection.getConnection();
        if (conn == null) {
            System.out.println("Failed to connect to database. Exiting...");
            return;
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. View Students");
            System.out.println("2. Add Student");
            System.out.println("3. Modify Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    StudentOperations.displayStudents(conn);
                    break;
                case 2:
                    StudentOperations.addStudent(conn, sc);
                    break;
                case 3:
                    StudentOperations.modifyStudent(conn, sc);
                    break;
                case 4:
                    StudentOperations.removeStudent(conn, sc);
                    break;
                case 5:
                    System.out.println("Exiting Program...");
                    DatabaseConnection.closeConnection(conn);
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
