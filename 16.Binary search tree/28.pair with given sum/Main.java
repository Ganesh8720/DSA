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
        // Node root = new Node(10);  
        // root.left = new Node(8);  
        // root.right = new Node(20);  
        // root.left.left=new Node(4);
        // root.left.right=new Node(9);
        // root.right.left = new Node(11);  
        // root.right.right = new Node(30);
        System.out.println("ele in inorder traversal");
        inorder(root);
        System.out.println("\nenter sum");
        int sum=sc.nextInt();
        
        HashSet<Integer> s=new HashSet<>();
        boolean res=isPairSum(root,sum,s);
        if(res){
            System.out.println("found pair");
        }  
        else{
            System.out.println("not found pair");
        }
    }
    static boolean isPairSum(Node root,int sum,HashSet<Integer>s){
        if(root==null){
            return false;
        }
        if(isPairSum(root.left, sum, s)==true){
            return true;
        }
        if(s.contains(sum-root.key)){
            return true;
        }
        else{
            s.add(root.key);
        }
        return isPairSum(root.right, sum, s);
    }
}
