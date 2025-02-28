import java.util.*;
class Node{
    int key;
    Node left,right;
    Node(int k){
        key=k;
        left=right=null;
    }
}
public class Search {
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
        System.out.println("inorder traversal");
        inorder(root);
        System.out.println("\nenter search ele");
        int s=sc.nextInt();
        System.out.println(search(root,s));
    }
    static boolean search(Node root,int s){
        while(root!=null){
            if(root.key==s){
                return true;
            }
            else if(root.key<s){
                root=root.right;
            }
            else{
                root=root.left;
            }
        }
        return false;
    }
}
