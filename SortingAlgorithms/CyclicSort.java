package SortingAlgorithms;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,2,4,5,1};

        // for cyclic sort: array must be in range [1,N]
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sort(int[] arr){
        int i=0;

        while(i<arr.length){
            // Ideally  { value= index +1 }

            //at every index, check if the current value at index is correct.
            if(arr[i]!=arr[arr[i]-1]){
                // if not then swap the value with the index where the value actually belongs
                swap(arr,i,arr[i]-1);
            }else i++; // if at correct position then check next
        }
    }
}
