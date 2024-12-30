package SearchingProblems;

public class RichestWealth {
    public static void main(String[] args) {
        int[][] acc={{1,2,3},{7,8,2}};
        System.out.println(maximumWealth(acc));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxSum=-1;
        for (int[] account : accounts) {
            int sum = 0;
            for (int j = 0; j < account.length; j++) {
                sum += account[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
