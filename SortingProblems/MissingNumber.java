package SortingProblems;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/

// Solution:  Using Cyclic Sort

class MissingNumber {
    public int missingNumber(int[] nums) {

        // Sort the array
        sort(nums);

        // return the index on which the value is not correct

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void sort(int[] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]<nums.length && nums[i]!=nums[nums[i]]){
                swap(nums,i,nums[i]);
            }else{
                i++;
            }
        }
    }
}