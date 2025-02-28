public class TOH {
    static void fun(int n,char s,char a,char d){
        if(n==1){
            System.out.println("move disc 1 from "+s+" to "+d);
            return;
        }
        fun(n-1,s,d,a);
        System.out.println("move disc "+n+" from "+s+" to "+d);
        fun(n-1,a,s,d);

    }
    public static void main(String[] args) {
        fun(3,'a','b','c');
    }
    
}
