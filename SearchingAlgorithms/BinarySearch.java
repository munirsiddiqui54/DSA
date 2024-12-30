package SearchingAlgorithms;

import java.util.Arrays;

import static SortingAlgorithms.BubbleSort.bubbleSort;

public class BinarySearch {
    public static void main(String[] args) {

        int target=99;
        int[] nums={1,4,2,90,43,12,8};

        // For Binary Search Array Must be sorted
//        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

        int index=binarySearch(nums,target);

        System.out.println(index>=0?index:"Not Found");
    }

    //using loop
    public static int binarySearch(int[]nums,int target){
        int start=0;
        int end=nums.length-1;

        while(start<=end){

            //int mid=(start+end)/2;
            int mid=start+(end-start)/2;

            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                //check on left
                end=mid-1;
            }else{
                //check on right
                start=mid+1;
            }
        }
        return -1; // if not found
    }

    public static int orderAgnosticBS(int[] nums,int target){
        int start=0;
        int end=nums.length-1;

        // Check order
        boolean isAsc=nums[start]<nums[end];

        while(start<=end){

            //int mid=(start+end)/2;
            int mid=start+(end-start)/2;

            if(target==nums[mid]){
                return mid;
            }
             if(isAsc){
                 if(target<nums[mid]){
                     //check on left
                     end=mid-1;
                 }else{
                     //check on right
                     start=mid+1;
                 }
             }else {
                 if(target<nums[mid]){
                     //check on right
                     start=mid+1;

                 }else{
                     //check on left
                     end=mid-1;
                 }
             }
        }
        return -1; // if not found
    }

    //using recursion
    public static int binarySearch(int[] nums,int target,int start,int end){
        if(start>end){
            return -1; // Not Found
            // return start; if floor is to be return
            // return start-1; if ceil is to be return
        }
        int mid=(start+end)/2;

        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            // Search on Left Side
            return binarySearch(nums,target,start,mid-1);
        }else{
            // Search on Right Side
            return binarySearch(nums,target,mid+1,end);
        }
    }
}
