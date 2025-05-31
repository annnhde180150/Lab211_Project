package Week3.BubbleSort;

import java.util.Random;

public class BubbleSort {
    private int[] arr;
    private int size;

    public BubbleSort(int[] array, int size) {
        this.arr = array;
        this.size = size;
    }
    public void sort() {
        getRamdomArray();
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, array is already sorted
            if (!swapped) break;
        }
        display(true);
    }

    //Get ramdom number in array
    private void getRamdomArray (){
        //Print ramdom array
        Random random = new Random();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }
        display(false);
    }

    private void display(boolean sortCheck) {
        if(sortCheck){
            System.out.print("Sorted Array:");
        }else{
            System.out.print("Unsorted Array:");
        }
        System.out.print("[");
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
