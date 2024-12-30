package SearchingProblems;

public class MountainPeak {
    public static void main(String[] args) {
        int[] nums={3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(nums));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while (start<end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                // if next index is smaller then explore left
                end=mid;
            }
            else{
                // otherwise right
                start=mid+1;
            }
        }
        return end;


    }
}
