import java.util.*;
class Node{
    int key;
    Node left,right;
    Node(int k){
        key=k;
        left=right=null;
    }
}
class Main{
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node root=null;
        System.out.println("enter inserted key elements");
        while(sc.hasNextInt()){
            int key=sc.nextInt();
            root=insert(root,key);
        }
        inorder(root);
    }
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
        
    }
}