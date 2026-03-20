package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class StackMy {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int number){
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        q1.add(number);

        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.remove();
        }
    }
    public int peek(){
        if(isEmpty()) throw  new RuntimeException("Stack is empty");
        return q1.peek();
    }
    public int pop(){
        if(isEmpty()) throw  new RuntimeException("Stack is empty");
        return q1.poll();
    }
    public boolean isEmpty(){
        return q1.isEmpty();
    }
}
