package Sorting;

public class SortZeroAndOne {
    public static void sortColors(int[] nums) {
        int l = 0, m = 0, h = nums.length-1;
        while(m <= h){
            if(nums[m] == 0){
                int temp = nums[m];
                nums[m] = nums[l];
                nums[l] = temp;
                l++;
                m++;
            }
            else if(nums[m] == 1){
                m++;
            }
            else{
                int temp = nums[h];
                nums[h] = nums[m];
                nums[m] = temp;

                h--;
            }
        }
    }      
    public static void main(String[] args) {
        int nums[] = {1,0,1,0,1,1,1,1,1,0,0,0,0,1};
        sortColors(nums);

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] +" ");
        }
        System.out.println();
    }
}
