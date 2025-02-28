import java.util.*;
class Queue{
    int size,cap;
    int a[];
    Queue(int c){
        cap=c;
        size=0;
        a=new int[c];
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
        a[size]=x;
        size++;
    }
    void deque(){
        if(isEmpty()){
            return ;
        }
        for (int i = 0; i < size-1; i++) {
            a[i]=a[i+1];
        }
        size--;
    }
    int getFront(){
        if(isEmpty()){
            return -1;
        }
        return 0;//front always full
    }
    int getRear(){
        if(isEmpty()){
            return -1;
        }
        return size-1;
    }
    int size(){
        return size;
    }
    void print(){
        System.out.println("queue elements are");
        for ( int i=0;i<size;i++) {
            System.out.print(a[i]+" ");
        }
    }

}
public class Naive {
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
        obj.deque();
        obj.enque(3);
        obj.print();
        System.out.println("\nsize is : "+obj.size());
        System.out.println("isEmpty : "+obj.isEmpty());
        System.out.println("isfull : "+obj.isFull());
        System.out.println("front : "+obj.getFront());
        System.out.println("rear : "+obj.getRear());
   
        obj.enque(5);
        obj.print();
        System.out.println("\nsize is : "+obj.size());
        System.out.println("isEmpty : "+obj.isEmpty());
        System.out.println("isfull : "+obj.isFull());
        System.out.println("front : "+obj.getFront());
        System.out.println("rear : "+obj.getRear());
   
    }
}
