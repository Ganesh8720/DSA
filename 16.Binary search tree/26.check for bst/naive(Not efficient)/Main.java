
import java.util.*;
class Node{
    Node left,right;
    int key;
    Node(int x){
        key=x;
    }
}
public class Main {
    static Node insert(Node root,int x){
        if(root==null){
            return new Node(x);
            
        }
        if(x<root.key){
            root.left=insert(root.left, x);
          
        }
        else if(x>root.key){
            root.right=insert(root.right, x);
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
        System.out.println("enter n ");
        int n=sc.nextInt();
        System.out.println("enter n ele");
        Node root=null;
        for(int i=0;i<n;i++){
            int key=sc.nextInt();
            root=insert(root,key);
        }
        System.out.println("ele in inorder traversal");
        inorder(root);
       
        if(isBST(root)==1){
            System.out.println("\nis bst");
        }
        else{
            System.out.println("not bst");
        }
    }
    static int isBST(Node root){
        if(root==null){
            return 1;
        }
        if(root.left!=null && max(root.left)>root.key){
            return 0;
        }
        if(root.right!=null && min(root.right)<root.key){
            return 0;
        }
        if(isBST(root.left)==0 ||isBST(root.right)==0){
            return 0;
        }
        return 1;
    }
    static int max(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int res=root.key;
        int lres=max(root.left);
        int rres=max(root.right);
        if(lres>res){
            res=lres;
        }
        if(rres>res){
            res=rres;
        }
        return res;
    }
    static int min(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int res=root.key;
        int lres=min(root.left);
        int rres=min(root.right);
        if(lres<res){
            res=lres;
        }
        if(rres<res){
            res=rres;
        }
        return res;
    }
    
}
