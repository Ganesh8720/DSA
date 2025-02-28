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
    
    static int search(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 1;
        }
        else{
            int res=search(head.next, key);
            if(res == -1){
                return -1;
            }
            else{
                return res+1;
            }
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
        System.out.println("enter key ele");
        int key=sc.nextInt();
        
        
        System.out.println(search(head,key));
    }
}
