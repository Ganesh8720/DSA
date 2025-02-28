import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class Case2 {
    static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println(" ");
    }

    static Node insertend(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            return temp;
        }
        Node curr=head; 
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        System.out.println("enter ele");
        while(true){
            if(sc.hasNextInt()){
                int input=sc.nextInt();
                head=insertend(head,input);
            }
            else{
                sc.next();
                break;
            }
        }
        System.out.println("enter the ele which we want to insert at the end");
        int i=sc.nextInt();
        System.out.println("list ele before insert");
        printlist(head);
        System.out.println("after insert");
        head=insertend(head, i);
        printlist(head);
    }
}
