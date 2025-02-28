class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
    }
}
public class Case1 {
    static void dis(Node head){
        Node curr=head;
        if(curr==null){
            return;
        }
        System.out.print(curr.data+" ");
        dis(curr.next);
    }
    public static void main(String[] args) {
        System.out.println("enter integers");
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        dis(head);
    }
}
