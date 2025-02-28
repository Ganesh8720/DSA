import java.util.*;
class Node{
    int key;
    Node left,right;
    Node(int k){
        key=k;
        left=right=null;
    }
}
public class Main{
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
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n values");
        int n=sc.nextInt();
        System.out.println("enter n values");
        Node root=null;
        for(int i=0;i<n;i++){
            int key=sc.nextInt();
            root=insert(root,key);
        }
        System.out.println(" before deletioninorder traversal");
        inorder(root);
        System.out.println("\nenter delete ele");
        int x=sc.nextInt();
        deleteNode(root,x);
        System.out.println("after deletion inorder :");
    
        inorder(root);
    }
    static Node deleteNode(Node root,int x){
        if(root==null){
            return null;
        }
        if(root.key>x){
            root.left=deleteNode(root.left, x);
        }
        else if(root.key<x){
            root.right=deleteNode(root.right, x);
        }
        //above if and else if is search an item logic
        else{
            //node have single child if left child null replace with right child or if right child null replace with left child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node successor=getsuc(root);
                root.key=successor.key;
                root.right=deleteNode(root.right, successor.key);

            }
        }
        return root;
    }
    static Node getsuc(Node root){
        //for picking closest grater ele move one step right and check right,left.left left until becomes null
        Node curr=root.right;
        while(curr!=null && curr.left!=null){
            curr=curr.left;
        }
        return curr;
    }
}
