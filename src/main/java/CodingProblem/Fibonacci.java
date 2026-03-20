package CodingProblem;


import java.util.*;
import java.util.stream.IntStream;


public class Fibonacci {

    public static void fibonacciSeries(int n){

       int first = 0;
       int second = 1;
       for(int i =1; i<n;i++){
           System.out.print(first+" ");
           int next = first+second;
           first = second;
           second = next;
       }

        System.out.println();
        System.out.print(first+" ");
    }

    public static int searchNumberByBinarySearch(int k, int[] array){
        int iterationCount=0;
        int index=0;
        int start =0 ;
        int end = array.length-1;
        while(start<end){
            iterationCount++;
            int mid = (start + end)/2;
            if(array[mid] == k) return mid;
            else if(array[mid]>k) end = mid-1;
            else start = mid+1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Random random = new Random();

        int min = 0;
        int max = 999;
        int[] array= new int[10];
         IntStream.range(0, 10).forEach(i-> array[i] = random.nextInt(100));

        int[] array1 = Arrays.stream(array).sorted().toArray();
        for (int i : array1)
             System.out.print(i +" ");

        System.out.println();
        System.out.println("***********");

        System.out.println("Enter value to be searched: ");
         Scanner s = new Scanner(System.in);
         int k = s.nextInt();
        int searchValueIndex = searchNumberByBinarySearch(k,array1);
        System.out.println(searchValueIndex);

    }
}
