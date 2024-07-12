package Searching;

public class BinarySeacrch {
    public static int binary(int arr[], int k){
        int si = 0;
        int ei = arr.length-1;
        
        while(si <= ei){
            int mid = si + (ei - si)/2;

            if(arr[mid] == k){
                return mid;
            }

            else if(arr[mid] < k){
                si = mid + 1;
            }
            else{
                ei = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int k = 40;

        System.out.println(binary(arr, k));
    }
}


//time complexity = O(logn)