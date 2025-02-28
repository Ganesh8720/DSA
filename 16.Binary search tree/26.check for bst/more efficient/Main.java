
import java.util.*;
class Node{
    Node left,right;
    int key;
    Node(int x){
        key=x;
    }
}
public class Main {
    // static Node insert(Node root,int x){
    //     if(root==null){
    //         return new Node(x);
            
    //     }
    //     if(x<root.key){
    //         root.left=insert(root.left, x);
          
    //     }
    //     else if(x>root.key){
    //         root.right=insert(root.right, x);
    //     }
    //     return root;
    // }
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);

        }
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter n ");
        // int n=sc.nextInt();
        // System.out.println("enter n ele");
        // Node root=null;
        // for(int i=0;i<n;i++){
        //     int key=sc.nextInt();
        //     root=insert(root,key);
        // }
        Node root = new Node(20);  
        root.left = new Node(8);  
        root.right = new Node(30);  
        root.right.left = new Node(18);  
        root.right.right = new Node(35);
        System.out.println("ele in inorder traversal");
        inorder(root);
        boolean res=isBST(root);
       
        if(res){
            System.out.println("\nis bst");
        }
        else{
            System.out.println("not bst");
        }
    }
    //idea is if bt of inorder traversal is increasing order then bst is true
    static int prev=Integer.MIN_VALUE;
    static boolean isBST(Node root){
        if(root==null){
            return true;
        }
        //check left sub tree
        if(isBST(root.left)==false){
            return false;
        }
        if(root.key<=prev){
            return false;
        }
        prev=root.key;
        return isBST(root.right);

    } 
}
