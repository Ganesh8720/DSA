import java.util.*;
public class Case1 {
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    static int  rank(String str){
        int m=str.length();
        int r=1;
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=i+1;j<m;j++){
                if(str.charAt(i)>str.charAt(j)){
                    count++;
                }
            }
            r=r+count*fact(m-1-i);

        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        System.out.println(rank(str));
    }
}
