import java.util.*;
public class PrintFirstN {
   static void print(int n){
      Queue<String> q=new LinkedList<>();
      q.add("5");
      q.add("6");
      for(int i=0;i<n;i++){
         String curr=q.poll();
         System.out.print(curr+" ");
         q.add(curr+"5");
         q.add(curr+"6");
      }

   }
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n :");
        int n=sc.nextInt();
        print(n);
   } 
}
