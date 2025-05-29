package Week2.PerimeterAndAreaProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Calculator Shape Program=====");

        // Rectangle
        System.out.print("Please input side width of Rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = scanner.nextDouble();
        Shape rectangle = new Rectangle(width, length);

        // Circle
        System.out.print("Please input radius of Circle: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);

        // Triangle
        System.out.print("Please input side A of Triangle: ");
        double sideA = scanner.nextDouble();
        System.out.print("Please input side B of Triangle: ");
        double sideB = scanner.nextDouble();
        System.out.print("Please input side C of Triangle: ");
        double sideC = scanner.nextDouble();
        Shape triangle = new Triangle(sideA, sideB, sideC);

        // Print results
        System.out.println();
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();

        scanner.close();
    }
}
