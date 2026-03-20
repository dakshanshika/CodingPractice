package Practice;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 7, 2, 4, 8};

        int[] ints = nextGreaterElement(arr);
        for(int i : ints){
            System.out.print(i+" ");
        }
    }
    private static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack();
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            //remove if stack element is small and stack is not empty
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            //set element in result if stack is empty ->-1 else stack immidaite element
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            //push element in stack
            stack.push(arr[i]);
        }
        return result;
    }
}

