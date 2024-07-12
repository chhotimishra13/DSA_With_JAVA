//missing number using two array in searching

package Searching;

public class MissingNumber {
    public static int missingNumber(int arr[], int brr[]){
        int n_xor = 0; 

        for(int i=0; i<arr.length; i++){
            n_xor = arr[i] ^ i;
        }

        for(int i=0; i<brr.length; i++){
            n_xor = brr[i] ^ i;
        }

        return n_xor;

    }
    public static void main(String[] args) {
        int arr[] = {7,2,5,3,5,3};
        int brr[] = {7,2,5,4,6,3,5,3};

        System.out.println(missingNumber(arr, brr));
    }
}
