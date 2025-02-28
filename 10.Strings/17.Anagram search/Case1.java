import java.util.*;
class Case1 {
    static final int CHAR=256;
    static boolean anagram(String txt,String pat,int i){
        int count[]=new int[CHAR];
        for(int j=0;j<pat.length();j++){
            count[pat.charAt(j)]--;
            count[txt.charAt(i+j)]++;
        }
        for(int x=0;x<CHAR;x++){
            if(count[x]!=0){
                return false;
            }
        }
        return true;
    }
    static boolean slide(String txt,String pat){
        int n=txt.length();
        int m=pat.length();
        for(int i=0;i<=n-m;i++){
           if(anagram(txt, pat, i)){
            return true;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("enter txt");
        String txt=sc.nextLine();
        System.out.println("enter pat");
        String pat=sc.nextLine();
        System.out.println(slide(txt,pat));
    }
}
