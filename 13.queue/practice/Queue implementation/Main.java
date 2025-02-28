import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an list");
        int n=sc.nextInt();
        Queue<Integer> q=new ArrayDeque<>();
        System.out.println("enter list elements");
        for(int i=0;i<n;i++){
            int input=sc.nextInt();
            q.offer(input);
        }
        System.out.println("queue ele : "+q);
        System.out.println("size : "+q.size());
        System.out.println("peek : "+q.peek());
        
        q.poll();
        q.poll();
        System.out.println("queue ele : "+q);
        System.out.println("size : "+q.size());
        System.out.println("peek : "+q.peek());
        
        

    }
}
