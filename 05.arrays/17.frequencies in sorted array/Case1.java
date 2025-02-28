public class Case1 {
    static void fun(int a[]){
        int n=a.length;
        int freq=1;
        int i=1;
        while(i<n){
            while(i<n && a[i]==a[i-1]){
                freq++;
                i++;
            }
            System.out.println(a[i-1]+" "+freq);
            freq=1;
            i++;
        }
        if(n==1 || a[n-1]!=a[n-2]){
            System.out.println(a[n-1]+" "+1);
        }
    }
    public static void main(String[] args) {
        int a[]={10,10,10,30,40,40};
        fun(a);
    }
}
