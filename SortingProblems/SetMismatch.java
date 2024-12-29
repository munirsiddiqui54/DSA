package SortingProblems;

import java.util.Arrays;

import static SortingAlgorithms.CyclicSort.cyclicSort;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr={2,2,1,4};

        //Apply Cyclic Sort first
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] nums =findErrorNums(arr);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] findErrorNums(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums[i]){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[] {-1,-1};
    }
}