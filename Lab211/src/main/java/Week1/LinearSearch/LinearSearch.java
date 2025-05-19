package Week1.LinearSearch;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    private Scanner sc;
    private int[] arr;
    private int size;
    public LinearSearch(Scanner sc, int size, int[] arr) {
        this.sc = sc;
        this.size = size;
        this.arr = arr;
    }

    public void linearSearch(Scanner sc, int n, int[] arr){
        arr = getArray(sc,n,arr);

        boolean found = false;
        int position = -1;
        System.out.print("Enter element to be searched:");
        int search = sc.nextInt();
        //Linear search
        for (int i = 0; i < n; i++) {
            if(arr[i] == search){
                found= true;
                position= i + 1;
                break;
            }
        }
        if(found){
            System.out.println("Element "+search+" found at position " + position);
        }
    }

    private int[] getArray(Scanner sc, int n, int[] arr){
        //Enter size of array
        arr = new int[n];
        getRamdomArray(n,arr);
        return arr;
    }

    //Get ramdom number in array
    private void getRamdomArray (int size, int[] arr){
        //Print ramdom array
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.print("The Array: [");
        for (int i = 0; i < size; i++) {
            if(i == size-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }

}
