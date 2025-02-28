public class Case1 {
    static int trap(int a[]){
        int n=a.length;
        int res=0;
        for(int i=1;i<n-1;i++){
            int lmax=a[i];
            for(int j=0;j<i;j++){
                lmax=Integer.max(lmax,a[j]);
            }
            int rmax=a[i];
            for(int j=i+1;j<n;j++){
                rmax=Integer.max(rmax,a[j]);
            }
            res=res+(Integer.min(lmax, rmax)-a[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={3,0,1,2,5};
        System.out.println(trap(a));
    }
    
}
