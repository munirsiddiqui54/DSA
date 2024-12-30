package SearchingProblems;

public class MountainArray {

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

int[] arr={0,1,2,4,2,1};
public int get(int i){
    return arr[i];
}
public int length(){
    return arr.length;
}

    public static void main(String[] args) {
        MountainArray m=new MountainArray();
        int index=findInMountainArray(2,m);
        System.out.println(index);
    }
    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=peakIndexInMountainArray(mountainArr);
        int index=binarySearch(mountainArr,target,0,peak);
        if(index!=-1){
            return index;
        } else
            return orderAgnosticBS(mountainArr,target,peak,mountainArr.length()-1);

    }
    public static int orderAgnosticBS(MountainArray nums,int target,int start,int end){

        // Check order
        boolean isAsc=nums.get(start)<nums.get(end);

        while(start<=end){

            //int mid=(start+end)/2;
            int mid=start+(end-start)/2;

            if(target==nums.get(mid)){
                return mid;
            }
            if(isAsc){
                if(target<nums.get(mid)){
                    //check on left
                    end=mid-1;
                }else{
                    //check on right
                    start=mid+1;
                }
            }else {
                if(target<nums.get(mid)){
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
    public static int binarySearch(MountainArray nums,int target,int start, int end){

        while(start<=end){

            //int mid=(start+end)/2;
            int mid=start+(end-start)/2;

            if(target==nums.get(mid)){
                return mid;
            }
            else if(target<nums.get(mid)){
                //check on left
                end=mid-1;
            }else{
                //check on right
                start=mid+1;
            }
        }
        return -1; // if not found
    }

    public static int peakIndexInMountainArray(MountainArray arr) {
        int start=0;
        int end=arr.length()-1;

        while (start<end){
            int mid=start+(end-start)/2;

            if(arr.get(mid)>arr.get(mid+1)){
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