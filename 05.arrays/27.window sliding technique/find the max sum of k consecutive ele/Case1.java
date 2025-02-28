public class Case1 {
    static int fun(int a[],int k){
        int n=a.length;
        int res=0;
        for(int i=0;i+k-1<n;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                sum=sum+a[i+j];
            }
            res=Integer.max(res,sum);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={1,8,30,-5,20,7};
        int k=3;
        System.out.println(fun(a,k));
    }
}
