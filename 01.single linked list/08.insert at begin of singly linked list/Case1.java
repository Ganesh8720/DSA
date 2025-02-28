class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class Case1 {
    static Node insert(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insert(head,10);
        head=insert(head,20);
        head=insert(head,30);
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
