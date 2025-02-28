import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class Case1 {
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
    static Node deletelast(Node head){
        //list contain no ele empty
        if(head==null){
            return null;
        }
        //list contain single element.that means that is the last elem so after delete that ele list converted into empty.so return null.
        if(head.next==null){
            return null;
        }
        //other wise find last element
        Node curr=head;
        while (curr.next.next!=null) {
            curr=curr.next;
        }
        curr.next=null;
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
       
        System.out.println("list ele");
        printlist(head);
        System.out.println("after del last ele");

        head=deletelast(head);
        printlist(head);
    }
}
