package Week3.BubbleSort;

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
                BubbleSort sort = new BubbleSort(arr,size);
                sort.sort();
            }
        }
    }
}
