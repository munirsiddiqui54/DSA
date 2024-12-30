package SearchingProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestGreaterLetter {
    public static void main(String[] args) {
        char[] arr={'e','e','e','e','e','e','e','e','n','n'};
        char target='e';
        char ceil=nextGreatestLetter(arr,target);
        System.out.println(Arrays.toString(arr)+" : "+ceil);

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        if(target>=letters[end]) return letters[0];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}