public class Case1 {
    static int max(int a[]){
        int n=a.length;
        int res=1;
        for(int i=0;i<n;i++){
            int curr=1;
            for(int j=i+1;j<n;j++){
                if((a[j]%2==0 && a[j-1]%2!=0) 
                || (a[j]%2!=0 && a[j-1]%2==0) ){
                    curr++;
                }
                else{
                    break;
                }
            }
            res=Integer.max(res, curr);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={5,10,21,6,3,8};
        System.out.println(max(a));
    }
    
}
