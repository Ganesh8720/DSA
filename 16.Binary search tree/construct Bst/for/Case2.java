import java.util.*;
class Node{
    int key;
    Node left,right;
    Node(int k){
        key=k;
        left=right=null;
    }
}
public class Case2 {
    static void inorder(Node root){
         if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of ele");
        int n=sc.nextInt();
        Node root=null;
         System.out.println("enter "+n+" elements"); 
        for(int i=1;i<=n;i++){
            int key=sc.nextInt();
            root=insert(root,key);
        }
        System.out.println("inorder traversal");
        inorder(root);

    }
    static Node insert(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key){
            root.left=insert(root.left, key);
        }
        else if(key>root.key){
            root.right=insert(root.right, key);
        }
        return root;

    }
}
