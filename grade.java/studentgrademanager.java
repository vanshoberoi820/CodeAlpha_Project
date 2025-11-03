import java.util.ArrayList;
import java.util.Scanner;

public class studentgrademanager {
    
    // ArrayLists to store student data
    static ArrayList<String> studentNames = new ArrayList<>();
    static ArrayList<Double> studentGrades = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("  STUDENT GRADE MANAGEMENT SYSTEM  ");
        System.out.println("===================================\n");
        
        boolean running = true;
        
        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. View Summary Report");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer
            
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    viewSummaryReport();
                    break;
                case 4:
                    running = false;
                    System.out.println("\nThank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
        
        scanner.close();
    }
    
    // Method to add a new student
    public static void addStudent() {
        System.out.print("\nEnter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter grade (0-100): ");
        double grade = scanner.nextDouble();
        scanner.nextLine(); // Clear buffer
        
        // Validate grade
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade! Please enter between 0-100.");
            return;
        }
        
        studentNames.add(name);
        studentGrades.add(grade);
        
        System.out.println("Student added successfully!");
    }
    
    // Method to view all students
    public static void viewAllStudents() {
        if (studentNames.isEmpty()) {
            System.out.println("\nNo students in the system yet!");
            return;
        }
        
        System.out.println("\n--- ALL STUDENTS ---");
        System.out.println("No.\tName\t\t\tGrade");
        System.out.println("---------------------------------------");
        
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.printf("%d.\t%-20s\t%.2f\n", 
                (i + 1), studentNames.get(i), studentGrades.get(i));
        }
    }
    
    // Method to calculate average grade
    public static double calculateAverage() {
        if (studentGrades.isEmpty()) {
            return 0.0;
        }
        
        double sum = 0;
        for (double grade : studentGrades) {
            sum += grade;
        }
        return sum / studentGrades.size();
    }
    
    // Method to find highest grade
    public static double findHighest() {
        if (studentGrades.isEmpty()) {
            return 0.0;
        }
        
        double highest = studentGrades.get(0);
        for (double grade : studentGrades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
    
    // Method to find lowest grade
    public static double findLowest() {
        if (studentGrades.isEmpty()) {
            return 0.0;
        }
        
        double lowest = studentGrades.get(0);
        for (double grade : studentGrades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
    
    // Method to view summary report
    public static void viewSummaryReport() {
        if (studentNames.isEmpty()) {
            System.out.println("\nNo students in the system yet!");
            return;
        }
        
        System.out.println("\n===================================");
        System.out.println("       SUMMARY REPORT");
        System.out.println("===================================");
        System.out.println("Total Students: " + studentNames.size());
        System.out.printf("Average Grade: %.2f\n", calculateAverage());
        System.out.printf("Highest Grade: %.2f\n", findHighest());
        System.out.printf("Lowest Grade: %.2f\n", findLowest());
        System.out.println("===================================");
        
        // Find and display top performer
        double highest = findHighest();
        for (int i = 0; i < studentGrades.size(); i++) {
            if (studentGrades.get(i) == highest) {
                System.out.println("Top Performer: " + studentNames.get(i) + 
                    " (" + highest + ")");
                break;
            }
        }
        
        System.out.println("===================================");
    }
}