package fitonyasha.views;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("\n1. Add Workout");
        System.out.println("2. Remove Workout");
        System.out.println("3. View Workouts");
        System.out.println("4. Add Progress");
        System.out.println("5. View Progress");
        System.out.println("6. Generate Report");
        System.out.println("7. Save Data");
        System.out.println("8. Load Data");
        System.out.println("9. Exit");
    }

    public String getOption() {
        System.out.print("Select an option: ");
        return scanner.nextLine();
    }

    public String getWorkoutType() {
        System.out.print("Enter workout type: ");
        return scanner.nextLine();
    }

    public int getDuration() {
        System.out.print("Enter duration (in minutes): ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int getCalories() {
        System.out.print("Enter calories burned: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public double getWeight() {
        System.out.print("Enter weight (kg): ");
        return Double.parseDouble(scanner.nextLine());
    }

    public double getBodyFat() {
        System.out.print("Enter body fat percentage: ");
        return Double.parseDouble(scanner.nextLine());
    }

    public double getWaist() {
        System.out.print("Enter waist circumference (cm): ");
        return Double.parseDouble(scanner.nextLine());
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
