package Week2.MatrixCalculator;

import java.util.Scanner;

class Matrix {
    private int rows;
    private int cols;
    private double[][] data;

    public Matrix(int rows, int cols) {

        this.rows = rows;
        this.cols = rows;
        data = new double[rows][cols];
    }

    public void input(Scanner scanner) {
        System.out.println("Enter values for a " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (true) {

                    System.out.print("Enter value at [" + (i + 1) + "][" + (j + 1) + "]: ");
                    if (scanner.hasNextDouble()) {
                        data[i][j] = scanner.nextDouble();
                        break;
                    } else {
                        System.out.println("Values of matrix must be the number.");
                        scanner.next(); // discard invalid input
                    }
                }
            }
        }
    }

    public void display() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("["+ data[i][j] + "]" + " ");
            }
            System.out.println();
        }
    }

    public Matrix additionMatrix(Matrix matrix2) {
        if (this.rows != matrix2.rows || this.cols != matrix2.cols) {
            throw new IllegalArgumentException("Matrix dimensions must match for addition.");
        }

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + matrix2.data[i][j];
            }
        }
        return result;
    }

    public Matrix subtractionMatrix(Matrix matrix2) {
        if (this.rows != matrix2.rows || this.cols != matrix2.cols) {
            throw new IllegalArgumentException("Matrix dimensions must match for subtraction.");
        }

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] - matrix2.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiplicationMatrix(Matrix matrix2) {
        if (this.cols != matrix2.rows) {
            throw new IllegalArgumentException("Number of columns of Matrix 1 must equal number of rows of Matrix 2.");
        }

        Matrix result = new Matrix(this.rows, matrix2.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < matrix2.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * matrix2.data[k][j];
                }
            }
        }
        return result;
    }
}
