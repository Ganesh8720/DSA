import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
class Case2 {
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
    static Node delete(Node head){
        if(head==null){
            return null;
        }
        else{
            return head.next;
        }

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
        System.out.println("after del first ele");

        head=delete(head);
        printlist(head);
    }
}
