import java.util.*;
public class Case1 {
    static boolean repeate(String str,int i,int j){
        boolean visited[]=new boolean[256];
        //initially all boolean values are by default false

        //first time visit make at particular position as true
        
        //if already any postion as true means you alredy visited that particular position.your again come so return false(because here alredy ture means alredy visited now again come same position mean it contain duplicate)
        for(int k=i;k<=j;k++){
            if(visited[str.charAt(k)]==true){
                return false;
            }
            else{
                //first time visited
                visited[str.charAt(k)]=true;
            }

        }
        return true;
    }
    static int fun(String str){
        int n=str.length();
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                 if(repeate(str,i,j)){
                    res=Math.max(res, j-i+1);
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
