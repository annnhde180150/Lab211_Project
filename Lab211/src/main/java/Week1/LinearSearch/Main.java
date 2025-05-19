package Week1.LinearSearch;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        int[] arr = new int[0];
        while (size <= 0) {
            System.out.print("Enter the size of the array:");
            size = sc.nextInt();
            if (size <= 0) {
                System.out.println("Invalid input");
            }else {
                LinearSearch linearSearch = new LinearSearch(sc, size, arr);
                linearSearch.linearSearch(sc, size, arr);
            }
        }
    }
}