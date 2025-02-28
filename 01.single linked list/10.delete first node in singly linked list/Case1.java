class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
    }
}
public class Case1 {
    static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }        
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
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;    
        temp1.next=temp2;
        System.out.println("list ele");
        printlist(head);
        System.out.println("\nafter deletion");
       printlist(delete(head));
       //or
       System.out.println("\n or");
       head=delete(head);
       printlist(head);
        
    }
}
