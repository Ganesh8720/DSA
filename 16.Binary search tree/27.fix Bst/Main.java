
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
        Node root = new Node(18);  
        root.left = new Node(60);  
        root.right = new Node(70);  
        root.left.left=new Node(4);
        root.right.left = new Node(8);  
        root.right.right = new Node(80);
        System.out.println("ele in inorder traversal");
        inorder(root);
        fixBST(root);
        int temp=first.key;
        first.key=sec.key;
        sec.key=temp;
        System.out.println("\nafter fix BST");
        inorder(root);
        
    }
    static Node prev=null,first=null,sec=null;
    static void fixBST(Node root){
        if(root == null){
            return;
        }
        fixBST(root.left);
        if(prev!=null && root.key<prev.key){
            if(first==null){
                first=prev;
            }
            sec=root;
        }
        prev=root;
        fixBST(root.right);
        
    } 
}
