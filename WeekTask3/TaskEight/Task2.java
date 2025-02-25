package Task1;
import java.sql.*;
import java.util.Scanner;

public class StudentOperations {
    public static void displayStudents(Connection conn) {
        String query = "SELECT * FROM student_details";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("\nStudent Records:");
            while (rs.next()) {
                int id = rs.getInt("student_id");
                String name = rs.getString("student_name");
                int age = rs.getInt("student_age");
                System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addStudent(Connection conn, Scanner sc) {
        System.out.println("\nEnter Student ID:");
        int id = sc.nextInt();
        System.out.println("Enter Name:");
        String name = sc.next();
        System.out.println("Enter Age:");
        int age = sc.nextInt();

        String query = "INSERT INTO student_details (student_id, student_name, student_age) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Student Added Successfully!");
            } else {
                System.out.println("Failed to add student.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void modifyStudent(Connection conn, Scanner sc) {
        System.out.println("\nEnter Student ID to update:");
        int id = sc.nextInt();
        System.out.println("Enter New Name:");
        String newName = sc.next();
        System.out.println("Enter New Age:");
        int newAge = sc.nextInt();

        String query = "UPDATE student_details SET student_name = ?, student_age = ? WHERE student_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, newName);
            ps.setInt(2, newAge);
            ps.setInt(3, id);
            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Student details updated successfully!");
            } else {
                System.out.println("No record found for ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void removeStudent(Connection conn, Scanner sc) {
        System.out.println("\nEnter Student ID to delete:");
        int id = sc.nextInt();

        String query = "DELETE FROM student_details WHERE student_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Student record deleted.");
            } else {
                System.out.println("No student found with ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
