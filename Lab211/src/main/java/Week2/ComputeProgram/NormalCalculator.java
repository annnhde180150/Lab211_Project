package Week2.ComputeProgram;

import java.util.Scanner;

public class NormalCalculator {
    private double number1, number2;
    private char operation;
    private Scanner sc;
    public NormalCalculator(double number1, char operation, double number2,Scanner sc) {
        this.number1 = number1;
        this.operation = operation;
        this.number2 = number2;
        this.sc = sc;
    }

    public void GetInput(){
        System.out.print("Enter number 1: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            sc.next();
        }
        number1 = sc.nextDouble();
        boolean isOperator = false;
        do{
            System.out.print("Enter The operator: ");
            operation = sc.next().charAt(0);
            switch(operation){
                case '+': isOperator = true; break;
                case '-': isOperator = true; break;
                case '*': isOperator = true; break;
                case '/': isOperator = true; break;
                case '^': isOperator = true; break;
                default: System.out.println("Invalid operation , please try again"); isOperator = false;;
            }
        }while(!isOperator);
        System.out.print("Enter number 2: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            sc.next();
        }
        number2 = sc.nextDouble();
    }


    public double Calculator (){
        double result = 0;
        GetInput();
        switch (operation) {
            case '+' : result = number1+ number2; break;
            case '-' : result = number1-number2; break;
            case '*' : result = number1*number2; break;
            case '/' : result = number1/number2; break;
            case '^' : result = Math.pow(number1, number2); break;
            default : result = 0;
        }
        return result;
    }
}
