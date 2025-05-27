package Week2.PerimeterAndAreaProgram;

import java.util.Scanner;

public class InputUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static double getDouble(String message) {
        double result = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print(message);
                result = Double.parseDouble(scanner.nextLine());
                if (result >= 0) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input. Please enter a non-negative number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return result;
    }

    public static int getInt(String message) {
        int result = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print(message);
                result = Integer.parseInt(scanner.nextLine());
                if (result >= 0) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        return result;
    }
}
