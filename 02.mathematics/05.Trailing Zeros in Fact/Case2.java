public class Case2 {
    static int fun(int n){
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res=res+n/i;
        }
        return res;
    } 
    public static void main(String[] args) {
        int n=12;
        System.out.println("given n "+n+" factorial contains "+fun(n)+" zeros");

    }
    
}
