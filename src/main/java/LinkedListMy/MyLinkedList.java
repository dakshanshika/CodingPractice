package LinkedListMy;

import java.util.stream.IntStream;

public class MyLinkedList {

    private Node head;

    public void addFirst(int data){
        Node node = new Node(data);

        if(head== null) head = node;
        else{
            node. next = head;
            head = node;
        }
    }

    public void add(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            Node cur = head;
            while(cur.next !=null){
                cur = cur.next;
            }

            cur.next = node;
        }
    }


    public void display(){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println();
    }

    public Node reverseLL(){
        Node cur = head;
        Node prev = null;
        Node next = null;

        while(cur != null){
            next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;
        }

        return prev;
    }

    public static void main(String[] args) {
     MyLinkedList myLinkedList = new MyLinkedList();
//     myLinkedList.add(1);
//        myLinkedList.add(2);
//        myLinkedList.add(3);
//        myLinkedList.add(4);
//
//        myLinkedList.display();
//        myLinkedList.reverseLL();
//        myLinkedList.display();
        IntStream.range(1,101).forEach(i-> myLinkedList.addFirst(101-i));
        myLinkedList.display();
//        Node head = myLinkedList.head;

        shootingNextProblem(myLinkedList.head);
    }

    private static void shootingNextProblem(Node head) {

        //make circular linkedlist
        Node curNode = head;
        while(curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = head;
        curNode= head;
        //iterate and shoot next until last left
        while(curNode.next !=curNode){
            curNode.next = curNode.next.next;
            curNode = curNode.next;
        }
        //print last

        System.out.println("Last left person :"+ curNode.data);

    }

}
