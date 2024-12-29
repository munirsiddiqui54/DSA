package SearchingAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr={1,7,3,4,-2,90,24,12,8};
        int target=90;

        int index= linearSearch(arr,target);

        System.out.println(index>0?index:"Not found");
    }
    public static int linearSearch(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
