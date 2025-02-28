public class CaseString {
    public static void main(String[] args) {
        String s="aba";
        String r="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            r=ch+r;
        }
        System.out.println(r);
        if(r.equals(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    
}
