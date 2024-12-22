package SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,4,1,3,5};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);

    }
    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
        System.out.println();
    }
    public static void swap(int[] nums,  int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void bubbleSort(int[] nums){
        boolean noSwap;
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            noSwap = false;
            for (int j = 0; j < N - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums,j, j + 1);
                    noSwap = true;
                }
            }
            if (noSwap == false) {
                break;
            }
        }
    }
}
