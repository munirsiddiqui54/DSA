package SearchingProblems;

public class EvenNumberDigits {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            boolean isEven=hasEvenDigit(arr[i]);
            if(isEven){
                count++;
            }
        }
        return count;
    }

    public static boolean hasEvenDigit(int num){
        if(num==0) return false;

        int digits = (int) Math.log10(Math.abs(num))+1;
        return digits % 2 == 0;
    }

}
