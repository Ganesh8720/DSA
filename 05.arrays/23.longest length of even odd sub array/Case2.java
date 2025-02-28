public class Case2 {
    static int maxEO(int a[]){
        int n=a.length;
        int res=1;
        int curr=1;
        for(int i=1;i<n;i++){
            if((a[i]%2==0 && a[i-1]%2!=0) 
            || (a[i]%2!=0 && a[i-1]%2==0)){
                curr++;
            }
            else{
                curr=1;
            }
            res=Integer.max(res, curr);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={5,10,21,6,3,8};
        System.out.println(maxEO(a));
    }
}
