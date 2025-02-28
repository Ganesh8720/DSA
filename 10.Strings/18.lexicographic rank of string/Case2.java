
import java.util.*;
public class Case2 {
    static int fact(int n){
        
        return (n<=1)?1:n*fact(n-1);
    }
    static final int CHAR=256; 
    static int rank(String str){
        int n=str.length();
        int res=1;
        int mul=fact(n);
        int count[]=new int[CHAR];
        for(int i=0;i<n;i++){
            count[str.charAt(i)]++;
        }
        for(int i=1;i<CHAR;i++){
            count[i]+=count[i-1];
        }
        for(int i=0;i<n-1;i++){
            mul=mul/(n-i);
            res=res+count[str.charAt(i)-1]*mul;
            //count[str.charAt(i)-1] here -1 because we want to current ele before ele count.before ele count give the no of ele is < current ele.
            for(int j=str.charAt(i);j<CHAR;j++){
                count[j]--;
            }
        }
        return res;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        System.out.println(rank(str));
    }
}

