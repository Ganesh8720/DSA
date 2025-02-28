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
    static Node newpos(Node head,int pos,int d){
        Node temp=new Node(d);
        
        Node curr=head;
        if(pos==1){
            temp.next=head;
            return temp;
        }
        
        for(int i=1;i<pos-1 && curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        temp.next=curr.next;
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
       
        System.out.println("list ele");
        printlist(head);
        System.out.println("enter pos and data");
        int pos=sc.nextInt();
        int d=sc.nextInt();
        System.out.println("new list");
        printlist(newpos(head,pos,d));
    }
}
