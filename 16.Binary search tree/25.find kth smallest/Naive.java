import java.util.*;
class Node{
    Node left,right;
    int key;
    Node(int x){
        key=x;
    }
}
public class Naive {
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
        System.out.println("\nenter k");
        int k=sc.nextInt();
        
        System.out.print("\nkth smaller is :");
        kthSmaller(root, k);
    }
    static int count=0;
    static void kthSmaller(Node root,int k){
        if(root!=null){
            kthSmaller(root.left, k);
            count++;
            if(count==k){
                System.out.println(root.key);
                // return;
            }
            kthSmaller(root.right, k);
        }
    }
}
