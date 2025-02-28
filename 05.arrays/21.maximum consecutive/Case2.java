public class Case2 {
    static int max(int a[]){
        int n=a.length;
        int res=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                count=0;
            }
            else{
                count++;
                res=Integer.max(res,count);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={1,1,1,1};
        System.out.println(max(a));
    }
    
}
