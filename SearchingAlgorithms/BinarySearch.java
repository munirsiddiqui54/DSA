package SearchingAlgorithms;

import java.util.Arrays;

import static SortingAlgorithms.BubbleSort.bubbleSort;

public class BinarySearch {
    public static void main(String[] args) {

        int target=4;
        int[] nums={1,4,2,90,43,12,8};

        // For Binary Search Array Must be sorted
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

        int index=binarySearch(nums,target,0,nums.length);

        System.out.println(index>=0?index:"Not Found");
    }
    public static int binarySearch(int[] nums,int target,int start,int end){
        int index=-1;
        int mid=(start+end)/2;

        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            // Search on Left Side
            index=binarySearch(nums,target,start,mid);
        }else{
            // Search on Right Side
            index=binarySearch(nums,target,mid,end);
        }

        return index;
    }
}
