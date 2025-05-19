package Week1.SolvingEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean choice= true;
        while (choice){
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Calculate Superlative Equation (Ax + B = 0)");
            System.out.println("2. Calculate Quadratic Equation (Ax^2 + Bx + C = 0)");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            Equation equation = new Equation(sc);
            switch (option){
                //Solve superlative equation
                case 1: equation.solveSuperlativeEquation(); break;
                //Solve Quadratic equation
                case 2: equation.solveQuadraticEquation(); break;
                //Exit system
                case 3:System.out.println("Thankyou!"); System.exit(0);
                //Invalid option
                default: System.out.println("Invalid option"); break;
            }
        }
    }
}
