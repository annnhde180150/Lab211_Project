package Week2.ComputeProgram;

import java.util.Scanner;

public class BMICalculator {
    private double weight;
    private double height;
    private Scanner sc;

    public BMICalculator( double weight, double height, Scanner sc) {
        this.weight = weight;
        this.height = height;
        this.sc = sc;
    }
    private void getInput() {
        System.out.print("Enter weight (kg): ");
        while(!sc.hasNextDouble()) {
            System.out.print("BMI is digit:");
            sc.nextLine();
        }
        weight = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        while(!sc.hasNextDouble()) {
            System.out.print("BMI is digit:");
            sc.nextLine();
        }
        height = sc.nextDouble() / 10;
    }

    public void calculateBMI() {
        getInput();
        double result = weight / (height * height);
        System.out.printf("BMI is: %.2f\n",result);
        if (result < 19){
            System.out.println("BMI Status: Under-standard");
        }
        if (result >= 19 && result <= 25){
            System.out.println("BMI Status: Standard");
        }
        if (result > 25 && result <= 30){
            System.out.println("BMI Status: Overweigh");
        }
        if (result > 30 && result <= 40){
            System.out.println("BMI Status: Fat-should lose weight");
        }
        if (result > 40){
            System.out.println("BMI Status: Very fat - should lose weight immediately ");
        }
    }

}
