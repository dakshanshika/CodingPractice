package CodingProblem;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumberByXor(int[] arr){

        int xor_array;
        int xor_all=0;

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        xor_array = Arrays.stream(arr).reduce(0, (a, b) -> a ^ b);
//        for(int n: arr){
//            xor_array ^= n;
//        }
        for(int i=min; i<=max;i++){
            xor_all = xor_all^i;
        }
        return xor_array^xor_all;
    }

    public static void main(String[] args) {
        FindFirstAndLastInSortedArray findFirstAndLastInSortedArray = new FindFirstAndLastInSortedArray();
        int[] arr = {1,2,3,3,3,3,5};
        System.out.println(findFirstAndLastInSortedArray.findFirstAndLastIndex(arr,31));
        MissingNumber missingNumber = new MissingNumber();
        int[] inputArray = {2,4,5,6,7};
        System.out.println("Missing Number : "+missingNumber.missingNumberByXor(inputArray));
    }
}
