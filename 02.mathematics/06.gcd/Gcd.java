public class Gcd {
    static int fun(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(fun(7,13));
    }    
}
