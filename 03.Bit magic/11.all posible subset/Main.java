public class Main {
    static void fun(String str){
        int n=str.length();
        int power=(int)Math.pow(2, n);
        for(int counter=0;counter<power;counter++){
            for(int i=0;i<n;i++){
                if((counter & (1<<i))!=0){
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        String str="abcd";
        fun(str);
    }
}
