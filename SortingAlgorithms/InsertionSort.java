package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={2,4,1,3,5};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] nums,  int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void insertionSort(int[] nums){
        int N=nums.length;

        // Traverse array till second last index
        for(int i=0;i<N-1;i++){
            // From the next index(i+1) till zeroth index
            for(int j=i+1;j>0;j--){
                // check if number is smaller than previous
                if(nums[j]<nums[j-1]){
                    // If yes then Swap else break
                    swap(nums,j,j-1);
                }else {
                    break;
                }
            }
        }
    }

}
