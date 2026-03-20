package ArraysProblem;

import java.util.Stack;

public class TwoSumBruteForce {

    public int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[i]+ nums[j]== target) return new int[]{i,j};
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        TwoSumBruteForce twoSumBruteForce = new TwoSumBruteForce();
        twoSumBruteForce.twoSum(new int[]{1,2,3,4,5,6,7},5);
//        Stack
    }
}
