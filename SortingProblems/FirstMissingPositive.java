package SortingProblems;

import java.util.Arrays;

import static SortingProblems.FindAllDuplicates.swap;


public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr={1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public static void cyclicSort(int[] arr){
        int i=0;

        while(i<arr.length){
            // For this specific question, ignore negative number, ignore i>N
            if(arr[i]>0 && arr[i]<arr.length&& arr[i]!=arr[arr[i]-1]){
                // if not then swap the value with the index where the value actually belongs
                swap(arr,i,arr[i]-1);
            }else i++; // if at correct position then check next
        }
    }
}