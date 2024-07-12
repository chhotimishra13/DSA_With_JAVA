//missing number using two array in searching

package Searching;

public class MissingNumber {
    public static void missingNumber(int arr[], int brr[]){
        // int n_xor = 0; 

        int missing1 = 0, missing2 = 0;
        for(int i=0; i<arr.length; i++){
            missing1 ^= arr[i];
        }

        for(int i=0; i<brr.length; i++){
            missing2 ^= brr[i] ;
        } 

        System.out.println("Missing numbers:");
        if (isMissing(arr, missing1)) {
            System.out.println(missing1);
        }
        if (isMissing(arr, missing2)) {
            System.out.println(missing2);
        }

    }
    public static boolean isMissing(int arr[], int missing){
        for (int num : arr) {
            if (num == missing) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {7,2,5,3,5,3};
        int brr[] = {7,2,5,4,6,3,5,3};

        missingNumber(arr, brr);
    }
}
