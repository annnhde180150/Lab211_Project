package Week2.MatrixCalculator;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("===== Matrix Program =====");
                System.out.println("1. Addition Matrix");
                System.out.println("2. Subtraction Matrix");
                System.out.println("3. Multiplication Matrix");
                System.out.println("4. Exit");
                System.out.print("Choose option: ");

                int choice;
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                } else {
                    System.out.println("Please enter a valid option number (1-4).");
                    scanner.next(); // clear invalid input
                    continue;
                }

                if (choice == 4) {
                    System.out.println("Exiting program...");
                    break;
                }

                //Enter Matrix 1
                System.out.print("Enter number of rows for Matrix 1: ");
                int r1 = scanner.nextInt();
                System.out.print("Enter number of columns for Matrix 1: ");
                int c1 = scanner.nextInt();
                Matrix m1 = new Matrix(r1, c1);
                m1.input(scanner);

                //Enter Matrix 2
                System.out.print("Enter number of rows for Matrix 2: ");
                int r2 = scanner.nextInt();
                System.out.print("Enter number of columns for Matrix 2: ");
                int c2 = scanner.nextInt();
                Matrix m2 = new Matrix(r2, c2);
                m2.input(scanner);

                try {
                    Matrix result = null;
                    switch (choice) {
                        case 1:
                            result = m1.additionMatrix(m2);
                            break;
                        case 2:
                            result = m1.subtractionMatrix(m2);
                            break;
                        case 3:
                            result = m1.multiplicationMatrix(m2);
                            break;
                        default:
                            System.out.println("Invalid option.");
                            continue;
                    }

                    System.out.println("Result:");
                    result.display();

                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }

                System.out.println();
            }

            scanner.close();
        }
}
