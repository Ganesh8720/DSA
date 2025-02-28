//circular array implementation

import java.util.*;
class Queue{
    int size,cap,front;
    int a[];
    Queue(int c){
        cap=c;
        size=0;
        front=0;
        a=new int[c];
    }
    int getFront(){
        if(isEmpty()){
            return -1;
        }
        return front;
    }
    int getRear(){
        if(isEmpty()){
            return -1;
        }
        return (front+size-1)%cap;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return (size==0);
    }
    boolean isFull(){
        return (cap==size);
    }
    void enque(int x){
        if(isFull()){
            return ;
        }
        int rear=getRear();
        rear=(rear+1)%cap;

        a[rear]=x;
        size++;
    }
    void deque(){
        if(isEmpty()){
            return ;
        }
        front=(front+1)%cap;
        size--;
    }
    
    void print(){
        System.out.println("queue elements are");
        for ( int i=0;i<size;i++) {
            System.out.print(a[i]+" ");
        }
    }

}
public class Efficient {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int c=sc.nextInt();
        Queue obj=new Queue(c);
        System.out.println("enter queue elements");
        for(int i=0;i<c;i++){
            int input=sc.nextInt();
            obj.enque(input);
        }
        obj.deque();
        // obj.deque();
        // obj.enque(3);
        obj.print();
        System.out.println("\nsize is : "+obj.size());
        System.out.println("isEmpty : "+obj.isEmpty());
        System.out.println("isfull : "+obj.isFull());
        System.out.println("front : "+obj.getFront());
        System.out.println("rear : "+obj.getRear());
   
        obj.enque(9);
        obj.print();
        System.out.println("\nsize is : "+obj.size());
        System.out.println("isEmpty : "+obj.isEmpty());
        System.out.println("isfull : "+obj.isFull());
        System.out.println("front : "+obj.getFront());
        System.out.println("rear : "+obj.getRear());
   
    }
}
