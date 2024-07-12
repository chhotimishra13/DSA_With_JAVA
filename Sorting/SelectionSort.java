package Sorting;

public class SelectionSort {
   
    public static void selectionSort(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
               if(arr[minPos] > arr[j]){
                    minPos = j;
               }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

            // Print indices of elements swapped
            System.out.println("Swapped: " + i + " and " + minPos);
            count++;
        }
        System.out.println("The total count of swapping  is  : "+count);
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {128,30,9,8,40,5,10,80,90};
        selectionSort(arr);
        printArr(arr);
    }
}
