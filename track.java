import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Fitness Tracker!");

        // Get user information
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Initialize variables for tracking exercise
        int totalSteps = 0;
        int totalCalories = 0;
        int totalMinutes = 0;

        // Record daily exercise activities
        System.out.println("\nEnter your daily exercise activities (enter 0 to finish):");
        while (true) {
            System.out.print("Enter steps walked: ");
            int steps = scanner.nextInt();
            if (steps == 0) {
                break;
            }

            System.out.print("Enter calories burned: ");
            int calories = scanner.nextInt();

            System.out.print("Enter minutes exercised: ");
            int minutes = scanner.nextInt();

            // Update totals
            totalSteps += steps;
            totalCalories += calories;
            totalMinutes += minutes;
        }

        // Display summary
        System.out.println("\nFitness Summary for " + userName + ":");
        System.out.println("Total Steps: " + totalSteps);
        System.out.println("Total Calories Burned: " + totalCalories);
        System.out.println("Total Minutes Exercised: " + totalMinutes);

        // Close the scanner
        scanner.close();
    }
}
