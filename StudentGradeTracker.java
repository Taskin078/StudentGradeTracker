import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class StudentGradeTracker {

    // Method to calculate the average score
    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Method to find the highest score
    public static int getHighestScore(ArrayList<Integer> grades) {
        return Collections.max(grades);
    }

    // Method to find the lowest score
    public static int getLowestScore(ArrayList<Integer> grades) {
        return Collections.min(grades);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        String continueInput;
        
        System.out.println("Welcome to the Student Grade Tracker!");
        
        // Collect grades from the teacher
        do {
            System.out.print("Enter student's grade: ");
            int grade = scanner.nextInt();
            grades.add(grade);

            System.out.print("Do you want to enter another grade? (yes/no): ");
            continueInput = scanner.next();
        } while (continueInput.equalsIgnoreCase("yes"));

        // Display the results
        if (grades.size() > 0) {
            System.out.println("\n--- Grade Summary ---");
            System.out.println("Total number of grades: " + grades.size());
            System.out.println("Average score: " + calculateAverage(grades));
            System.out.println("Highest score: " + getHighestScore(grades));
            System.out.println("Lowest score: " + getLowestScore(grades));
        } else {
            System.out.println("No grades were entered.");
        }

        scanner.close();
    }
}
