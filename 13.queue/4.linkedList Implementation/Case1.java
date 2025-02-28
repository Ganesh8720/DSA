import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Queue{
    Node front,rear;
    int size;
    Queue(){
        front=rear=null;
        size=0;
    }
    void enque(int x){
        Node temp=new Node(x);
        size++;
        if (front == null) {
            front=rear=temp;
            return ;
        }
        rear.next=temp;
        rear=temp;
    }
    void deque(){
        if(front==null){
            return ;
        }
        size--;
        front=front.next;
        if(front==null){
            rear=null;
        }
    }
    int getFront(){
        return front.data;
    }
    int getRear(){
        return rear.data;
    }
    int getSize(){
        return size;
    }
    void printlist(){
        Node curr=front;
        System.out.println("list ele are");
        while(curr!= null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println("");
    }
}
public class Case1 {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.printlist();
        System.out.println("front : "+q.getFront());
        System.out.println("rear : "+q.getRear());
        System.out.println("Size : "+q.getSize());
        q.deque();
        q.deque();
        q.printlist();
        q.enque(5);
        q.enque(6);
        q.printlist();


        
    }
}
