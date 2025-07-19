import java.sql.*;
import java.util.Scanner;

public class jdbccrudExample{

    static final String DB_URL = "jdbc:mysql://localhost:3306/jdbcexample";
    static final String USER = "root";
    static final String PASS = "Shruti@06";

    static Connection conn;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            //Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Connection establishment
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to the database!");

            while (true) {
                System.out.println("\n1. Insert\n2. Display\n3. Update\n4. Delete\n5. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1: insertStudent(); break;
                    case 2: displayStudents(); break;
                    case 3: updateStudent(); break;
                    case 4: deleteStudent(); break;
                    case 5:
                        System.out.println("Exiting...");
                        conn.close();
                        sc.close();
                        return;
                    default: System.out.println("Invalid option.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void insertStudent() {
        try {
            System.out.println("Enter Id:");
            int id= sc.nextInt();
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter email: ");
            String email = sc.next();

            String query = "INSERT INTO students (id, name, email) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.executeUpdate();
            System.out.println("Student inserted successfully.");
        } catch (Exception e) {
            System.out.println("Error inserting student: " + e.getMessage());
        }
    }

    static void displayStudents() {
        try {
            String query = "SELECT * FROM students";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Email: " + rs.getString("email"));
            }
        } catch (Exception e) {
            System.out.println("Error fetching students: " + e.getMessage());
        }
    }

    static void updateStudent() {
        try {
            System.out.print("Enter ID to update: ");
            int id = sc.nextInt();
            System.out.print("Enter new name: ");
            String name = sc.next();
            System.out.print("Enter new email: ");
            String email = sc.next();

            String query = "UPDATE students SET name=?, email=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student updated successfully.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (Exception e) {
            System.out.println("Error updating student: " + e.getMessage());
        }
    }

    static void deleteStudent() {
        try {
            System.out.print("Enter ID to delete: ");
            int id = sc.nextInt();

            String query = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (Exception e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }
}
