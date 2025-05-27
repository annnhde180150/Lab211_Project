package Week2.ComputeProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("======== Calculator Program ========");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            System.out.print("Please choice one option: ");

            //Validate input
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number (1-3): ");
                scanner.next();
            }

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    //Normal calculator;
                    System.out.println("Normal Calculator selected.");
                    double number1 =0, number2=0;
                    char operator= ' ';
                    NormalCalculator normalCalculator = new NormalCalculator(number1,operator,number2,scanner);
                    System.out.println("Result:"+normalCalculator.Calculator());
                    break;
                case 2:
                    //BMI calculator;
                    System.out.println("BMI Calculator selected.");
                    double weight=0;
                    double height=0;
                    BMICalculator bmiCalculator = new BMICalculator(weight,height,scanner);
                    bmiCalculator.calculateBMI();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
        } while (option != 3);

        scanner.close();

    }
}
