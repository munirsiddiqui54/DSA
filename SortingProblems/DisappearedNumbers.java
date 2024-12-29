package SortingProblems;

import java.util.*;

class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(arr));

        // Apply Cyclic Sort
        cyclicSort(arr);

        // Return the numbers which are not at their indices
        List<Integer> list=findDisappearedNumbers(arr);

        System.out.println(list);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static List<Integer> findDisappearedNumbers(int[] arr){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++ ){
            if(i+1!=arr[i]){
                list.add(i+1);
            }
        }
        return list;
    }
    static void cyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }

}