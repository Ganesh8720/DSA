public class CaseRec {
    static boolean fun(String s,int start,int end){
        if(start>=end) return true;
        return (s.charAt(start)==s.charAt(end) && fun(s, start+1, end-1));
    }
    public static void main(String[] args) {
        String s="aba";
        int start=0;
        int end=s.length()-1;
        
        System.out.println(fun(s,start,end));
    }
    
}
