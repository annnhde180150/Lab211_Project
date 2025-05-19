package Week1.SolvingEquation;

import java.util.Scanner;

public class Equation {
    private Scanner sc;
    public Equation(Scanner sc){
        this.sc = sc;
    }

    public void solveSuperlativeEquation(){
        //Display and ask user for enter input
        System.out.println("\n--- Solving Superlative Equation (Ax + B = 0) ---");
        System.out.println("Enter the A equation:");
        double a = sc.nextDouble();
        System.out.println("Enter the B equation:");
        double b = sc.nextDouble();

        //Check A =0
        if(a==0){
            //Check A =0
            if(b==0){
                System.out.println("solution(0 = 0).");
            }else{
                System.out.println("The equation has no solution(A=0 and B!=0).");
            }
        //Solve equation
        }else{

            double x = -b / a;
            System.out.printf("Solution: x = %.2f\n", x);
        }
    }

    public void solveQuadraticEquation(){
        //Display and ask user for enter input
        System.out.println("\n--- Solving Quadratic Equation (Ax^2 + Bx + C = 0) ---");
        System.out.println("Enter the A equation:");
        double a = sc.nextDouble();
        System.out.println("Enter the B equation:");
        double b = sc.nextDouble();
        System.out.println("Enter the C equation:");
        double c = sc.nextDouble();

        //Check A =0
        if(a==0){
            System.out.println("This is not a quadratic equation. Solving as Superlative...");
            if (b == 0) {
                System.out.println("No solution (A and B are zero).");
            } else {
                double x = -c / b;
                System.out.printf("Solution: x = %.2f\n", x);
            }
        //Solve quadratic equation
        }else{
            double delta = b * b - 4 * a * c;
            if (delta < 0)
            {
                System.out.println("The equation has no solution.");
            }
            else
            {
                if(delta == 0)
                {
                    double x = -b / (2 * a);
                    System.out.printf("Double root: x = %.2f\n", x);
                }
                else
                {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.printf("Roots: x1 = %.2f, x2 = %.2f\n", x1, x2);
                }
            }
        }


    }
}
