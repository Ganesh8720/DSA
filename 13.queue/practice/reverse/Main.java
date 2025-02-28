import java.util.*;
public class Main {
    static Queue<Integer> q=new LinkedList<>();
    static void reverse(){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.add(q.poll());
        }
        while(!s.isEmpty()){
            q.offer(s.pop());
        }
        for(int x:q){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        System.out.println("enter n elements");
        
        for(int i=0;i<n;i++){
            int input=sc.nextInt();
            q.offer(input);
        }
        System.out.println(q);
        System.out.println("reverse : ");
        reverse();
        System.out.println("\n"+q);

    }

}
