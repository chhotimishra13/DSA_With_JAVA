package Searching ;

public class LinearSearch {
    public static int linear(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,10,30};
        int key = 10;

        System.out.println(linear(arr, key));
    }
}

//time complexity = O(n)
