package LinearSearch;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        //Enter size of array
        int[] arr = new int[0];
        while (n <= 0){
            System.out.print("Enter the size of the array:");
            n = sc.nextInt();
            if(n <= 0){
                System.out.println("Invalid input");
            }else{
                arr = new int[n];
            }
        }

        //Print ramdom array
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.print("The Array: [");
        for (int i = 0; i < n; i++) {
            if(i == n-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            }

        }
        System.out.println("]");
        boolean found = false;
        int position = -1;
        System.out.print("Enter element to be searched:");
        int search = sc.nextInt();
        //Linear search
        for (int i = 0; i < n; i++) {
            if(arr[i] == search){
                found= true;
                position= i;
                break;
            }
        }
        if(found){
            System.out.println("Element "+search+" found at position " + position);
        }
    }
}
