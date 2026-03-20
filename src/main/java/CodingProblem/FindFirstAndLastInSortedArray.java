package CodingProblem;

import java.util.ArrayList;
import java.util.List;

public class FindFirstAndLastInSortedArray {

    public int findfirstIndex(int[] arr, int k){

        int start = 0;
        int end = arr.length -1;
        int mid = 0;
        int firstIndex=-1;
        while(start<=end){
            mid = (start+end)/2;

            if(arr[mid]==k){
                firstIndex = mid;
                end = mid-1;
            }
            else if(arr[mid]>k) end = mid-1;
            else start = mid+1;
        }
        return firstIndex;
    }


    public int findlastIndex(int[] arr, int k){
        int start = 0;
        int end = arr.length -1;
        int mid = 0;
        int lastIndex=-1;
        while(start<=end){
            mid = (start+end)/2;

            if(arr[mid]==k){
                lastIndex = mid;
                start = mid+1;
            }
            else if(arr[mid]>k) end = mid-1;
            else start = mid+1;
        }
        return lastIndex;
    }

    public List<Integer> findFirstAndLastIndex(int[]arr, int k){
        List<Integer> output = new ArrayList<>();
        output.add(findfirstIndex(arr,k));
        output.add(findlastIndex(arr,k));
        return output;
    }
}
