package SearchingProblems;

import java.util.Arrays;


public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr={1,3,3,3,3,3,3,7,8};
        int target =3;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    public static int lastOccurence(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
        int result=-1;

        if(target>nums[nums.length-1]) return -1;

        while(start<=end){

            //int mid=(start+end)/2;
            int mid=start+(end-start)/2;

            if(target==nums[mid]){
                result=mid;
                start=mid+1;
            }

            else if(target<nums[mid]){
                //check on left
                end=mid-1;
            }else{
                //check on right
                start=mid+1;
            }
        }
        return result; // if not found
    }
    public static int firstOccurence(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
        int result=-1;

        while(start<=end){
            //int mid=(start+end)/2;
            int mid=start+(end-start)/2;

            if(target==nums[mid]) {
                result = mid;
                end = mid - 1;
            }

            else if(target<nums[mid]){
                //check on left
                end=mid-1;
            }else{
                //check on right
                start=mid+1;
            }
        }
        return result; // if not found
    }
    public static int[] searchRange(int[] nums, int target) {

        int index=firstOccurence(nums,target);
        int index2=lastOccurence(nums,target);

        System.out.println("Index:"+index);

        System.out.println("Index2:"+index2);
        return new int[] {index,index2};
    }
}
