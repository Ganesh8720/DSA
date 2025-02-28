import java.util.*;
public class Naive {
    static void pattern(String txt,String p){
        int n=txt.length();
        int m=p.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for( j=0;j<m;j++){
                if(txt.charAt(i+j)!=p.charAt(j)){
                    break;
                }
            }
            if(j==m){
                System.out.print(i+" ");
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter txt");
       String txt=sc.nextLine();
        System.out.println("enter pattern");
        String p=sc.nextLine();
        

        pattern(txt,p);
    }
}
