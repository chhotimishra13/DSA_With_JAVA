package Sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int count = 0;
        for(int turn=0; turn<arr.length-1; turn++){
           for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
           }
         
        }
        System.out.println("the swapping counting is  : "+count);
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {128,30,9,8,40,5,10,80,90};
        bubbleSort(arr);
        printArr(arr);
    }
}
