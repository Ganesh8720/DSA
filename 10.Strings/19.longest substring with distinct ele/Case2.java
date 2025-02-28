import java.util.*;
public class Case2 {
    static int fun(String str){
        int res=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            boolean visited[]=new boolean[256];
            for(int j=i;j<n;j++){
                if(visited[str.charAt(j)]==true){
                    break;
                }
                else{
                    visited[str.charAt(j)]=true;
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        System.out.println(fun(str));
    }
}

