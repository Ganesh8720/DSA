//using linked list
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
class MyStack{
    Node head;
    int size;
    MyStack(){
        head=null;
        size=0;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return (head==null);
    }
    void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        size++;
    }
    void pop(){
        if(head==null){
            System.out.println("Empty-underflow");
        }
        head=head.next;
        size--;
    }
    int peek(){
        if(head==null){
            System.out.print("empty-");
            return Integer.MAX_VALUE;
        }
        return head.data;
    }
    void getMin(){
        int min=head.data;
        Node curr=head;
        while(curr!=null){
            if(curr.data<min){
                min=curr.data;
            }
            curr=curr.next;
        }
        System.out.print(min+" ");
    }
}
class Practice3 {
    public static void main(String[] args) {
        MyStack s=new MyStack();
        s.push(20);
        s.push(10);
        s.getMin();
        s.push(5);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.getMin();

        // s.push(5);
        // System.out.println(s.peek());
        // s.pop();
        // System.out.println(s.peek());
    }  
}
