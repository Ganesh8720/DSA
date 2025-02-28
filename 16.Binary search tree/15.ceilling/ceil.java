import java.util.*;
class Node{
    int key;
    Node left,right;
    Node(int k){
        key=k;
        left=right=null;
    }
}
public class ceil {
    static Node insert(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key>root.key){
            root.right=insert(root.right, key);
        }
        else if(key<root.key){
            root.left=insert(root.left, key);
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
        System.out.println("enter no of ele");
        int n=sc.nextInt();
        System.out.println("enter n ele");
        Node root=null;
        for(int i=0;i<n;i++){
            int key=sc.nextInt();
            root=insert(root,key);
        }
        System.out.println("inserted ele in inorder traversal");
        inorder(root);
        System.out.println("\nenter x");
        int x=sc.nextInt();
        Node ceilNode=ceilling(root, x);
        if(ceilNode!=null){
            System.out.println("ceil : "+ceilNode.key);
        }
        else{
            System.out.println("ceil not found");
        }

    }
    static Node ceilling(Node root,int x){
        Node res=null;
        while(root!=null){
            if(root.key==x){
                return root;
            }
            else if(root.key<x){
                root=root.right;
            }
            else{
                res=root;
                root=root.left;
            }
        }
        return res;
    }
}
