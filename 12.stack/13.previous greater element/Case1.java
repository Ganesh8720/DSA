public class Case1 {
    public static void main(String[] args) {
        int a[]={6,2,5,4,1,5,6};
        int n=a.length;
        System.out.print("-1"+" ");
        for(int i=1;i<n;i++){
            int res=-1;
            for(int j=i-1;j>=0;j--){
                if(a[j]>a[i]){
                    res=a[j];
                    break;
                }
                
            }
            System.out.print(res+" ");
        }
    }
}
