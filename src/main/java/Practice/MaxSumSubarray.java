package Practice;

public class MaxSumSubarray {

    public static void main(String[] args) {

        int[] arr = {2,1,5,1,3,2};
        System.out.println(maxSubArryResult(arr, 2));


    }

    public static int maxSubArryResult(int[] arr, int k) {
        int arrLength = arr.length;

        if(arrLength == 0 || arrLength < k) return -1;

        int sum = 0;

        // first window
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        int maxSum = sum;

        // sliding window
        for(int i = 1; i <= arrLength - k; i++){
            sum = sum - arr[i - 1] + arr[i + k - 1];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
