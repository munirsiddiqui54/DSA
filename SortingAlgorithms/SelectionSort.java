package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,-4};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] nums,  int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static int getMaxIndex(int[] nums, int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        return max;
    }
    public static void selectionSort(int[] nums){
        int N=nums.length;

        //select one element and place it on the correct position
        for(int i=0;i<N;i++){

            // get the index of maximum number
            int index=getMaxIndex(nums,0,N-i-1);

            //swap it with correct index
            swap(nums,index,N-i-1);

        }
    }

}
