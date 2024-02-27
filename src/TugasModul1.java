import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TugasModul1 {
    private static final Map<String, String> adminCredentials = new HashMap<>();
    private static final Map<String, String> studentCredentials = new HashMap<>();

    static {
        adminCredentials.put("admin", "admin123");
        studentCredentials.put("student", "student123");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userType;

        do {
            System.out.println("Welcome to Library Management System");
            System.out.println("1. Admin Login");
            System.out.println("2. Student Login");
            System.out.println("3. Exit");
            System.out.print("Please choose user type or exit: ");
            userType = scanner.nextLine();

            switch (userType) {
                case "1":
                    adminLogin(scanner);
                    break;
                case "2":
                    studentLogin(scanner);
                    break;
                case "3":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!userType.equals("3"));

        scanner.close();
    }

    private static void adminLogin(Scanner scanner) {
        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();

        if (adminCredentials.containsKey(username) && adminCredentials.get(username).equals(password)) {
            System.out.println("Admin login successful!");
            // Add admin functionalities here
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void studentLogin(Scanner scanner) {
        System.out.print("Enter student username: ");
        String username = scanner.nextLine();
        System.out.print("Enter student password: ");
        String password = scanner.nextLine();

        if (studentCredentials.containsKey(username) && studentCredentials.get(username).equals(password)) {
            System.out.println("Student login successful!");
            // Add student functionalities here
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryLoginSystem {
    private static final Map<String, String> adminCredentials = new HashMap<>();
    private static final Map<String, String> studentCredentials = new HashMap<>();

    static {
        adminCredentials.put("admin", "admin123");
        studentCredentials.put("student", "student123");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userType;

        do {
            System.out.println("Welcome to Library Management System");
            System.out.println("1. Admin Login");
            System.out.println("2. Student Login");
            System.out.println("3. Exit");
            System.out.print("Please choose user type or exit: ");
            userType = scanner.nextLine();

            switch (userType) {
                case "1":
                    adminLogin(scanner);
                    break;
                case "2":
                    studentLogin(scanner);
                    break;
                case "3":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!userType.equals("3"));

        scanner.close();
    }

    private static void adminLogin(Scanner scanner) {
        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();

        if (adminCredentials.containsKey(username) && adminCredentials.get(username).equals(password)) {
            System.out.println("Admin login successful!");
            // Add admin functionalities here
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void studentLogin(Scanner scanner) {
        System.out.print("Enter student username: ");
        String username = scanner.nextLine();
        System.out.print("Enter student password: ");
        String password = scanner.nextLine();

        if (studentCredentials.containsKey(username) && studentCredentials.get(username).equals(password)) {
            System.out.println("Student login successful!");
            // Add student functionalities here
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}