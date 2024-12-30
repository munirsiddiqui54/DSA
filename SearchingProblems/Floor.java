package SearchingProblems;

import java.util.Arrays;

import static SortingAlgorithms.BubbleSort.bubbleSort;

public class Floor {
    public static void main(String[] args) {

        int target=3;
        int[] nums={1,2,4,4,4,4,5,5};

        // For Binary Search Array Must be sorted
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

        int index=floor(nums,target);

        System.out.println(index>=0?index:"Not Found");
    }

    //using loop
    public static int floor(int[]nums,int target){
        int start=0;
        int end=nums.length-1;

        while(start<=end){

            //int mid=(start+end)/2;
            int mid=start+(end-start)/2;


            if(target==nums[mid]) return mid;

            else if(target<nums[mid]){
                //check on left
                end=mid-1;
            }else{
                //check on right
                start=mid+1;
            }
        }
        return end; // if not found
    }
}
