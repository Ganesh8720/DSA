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
    static Node insert(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }

    static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        Node head=null;
        System.out.println("enter integers");
        
        while(true){
            if(sc.hasNextInt()){
                int input=sc.nextInt();
                head=insert(head,input);
            }
            else{
                break;
            }
        }
        System.out.println("list ele");
        printlist(head);
        System.out.println("after insert element");
        int i=sc.nextInt();
        
        head=insert(head,i);
        printlist(head);
        
       
       
    
    }  
     
}
