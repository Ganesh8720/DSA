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
    
    static int search(Node head,int key){
        Node curr=head;
        int i=1;
        while(curr!=null){
            if(key==curr.data){
               return i; 
            }
            curr=curr.next;
            i++;
        }
        return -1;
        
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
        System.out.println("enter key ele");
        int key=sc.nextInt();
        
        
        System.out.println(search(head,key));
    }
}
