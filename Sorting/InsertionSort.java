package Sorting;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;

                System.out.println("Swapped: " + prev + " and " + (prev+1)); 
                count++;
            }
            arr[prev+1] = curr;
        }
        System.out.println("Total count of swapping is  : "+count);
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        int arr[] = {70,60,10,8,9};
        insertionSort(arr);
        printArr(arr);
    }
}
