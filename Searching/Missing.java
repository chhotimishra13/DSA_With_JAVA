
public class Missing {
    public static void main(String[] args) {
        int arr[] = {7, 2, 5, 3, 5, 3};
        int brr[] = {7, 2, 5, 4, 6, 3, 5, 3};

        findMissingNumbers(arr, brr);
    }

    public static void findMissingNumbers(int[] arr, int[] brr) {
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }
        for (int num : brr) {
            xor ^= num;
        }
        int mask = xor & -xor; 

        int missing1 = 0, missing2 = 0;

        // Divide elements into two groups based on the rightmost set bit (mask)
        for (int num : arr) {
            if ((num & mask) != 0) {
                missing1 ^= num;
            } else {
                missing2 ^= num;
            }
        }
        for (int num : brr) {
            if ((num & mask) != 0) {
                missing1 ^= num;
            } else {
                missing2 ^= num;
            }
        }

        // Output the missing numbers
        System.out.println("Missing numbers:");
        if (isMissing(arr, missing1)) {
            System.out.println(missing1);
        }
        if (isMissing(arr, missing2)) {
            System.out.println(missing2);
        }
    }

    // Check if the missing number is indeed missing from arr
    private static boolean isMissing(int[] arr, int missing) {
        for (int num : arr) {
            if (num == missing) {
                return false;
            }
        }
        return true;
    }
}
