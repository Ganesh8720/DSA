import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class Casse2 {
    //give the output as reverse order
    static Node insert(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
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

    static void printlist(Node head){
        Node curr=head;
        while (curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements");
        Node head=null;
        while(true){
            if(sc.hasNextInt()){
                int input=sc.nextInt();
                head=insertend(head, input);
            }
            else{
                break;
            }
        }
        System.out.println("list elements are :");
        printlist(head);
    }
}
