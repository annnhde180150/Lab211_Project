package Week3.QuickSort;

import java.util.Random;

public class QuickSort {
    private int[] arr;
    private int size;

    public QuickSort(int[] array,int size) {
        this.arr = array;
        this.size = size;
    }
    public void sort(){
        getRamdomArray();
        quickSort(0, this.size - 1);
        display(true);
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSort(low, pivotIndex - 1);  // sort left part
            quickSort(pivotIndex + 1, high); // sort right part
        }
    }

    private int partition(int low, int high) {
        int pivot = arr[high]; // pivot
        int i = low - 1; // index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap array[i] and array[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
         }

        // swap array[i+1] and array[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
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
