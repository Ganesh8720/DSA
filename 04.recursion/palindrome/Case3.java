public class Case3 {
    static boolean fun(String s){
        String r="";
        char ch;
        // for(int i=s.length()-1;i>=0;i--){
        //     ch=s.charAt(i);
        //     r=r+ch;
        // }
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            r=ch+r;
        }
        if(r.equals(s)){
            return true;
        }
        return false;
    }
    static void fun2(String s){
        if(fun(s)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
    public static void main(String[] args) {
        String s="abbcebba";
        fun2(s);
    }
    
}
