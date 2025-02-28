class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class Case1 {
    static Node insertend(Node head,int x){
        //create a temparary node which store the value that you insert
        Node temp=new Node(x);
        //if list is empy then return directly in temp value
        if(head==null){
            return temp;
        }
        //if node have some elements the  assing head as the current element
        Node curr=head;
        //find the last node of the linked list
        while (curr.next!=null) {
            curr= curr.next;
        }
        //after finding the last node .assign last node next as the temp stored value.
        curr.next=temp;
        return head;

    }
    public static void main(String[] args) {
        Node head= null;
        head=insertend(head,10);
        head=insertend(head,20);
        head=insertend(head,30);
        printlist(head);

    }
    static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        
    }
}
