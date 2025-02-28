public class Case1 {
    static void max(int a[]){
        int n=a.length;
        int res=a[1]-a[0];
        for(int i=0;i<n-1;i++){
            int dif=0;
            for(int j=i+1;j<n;j++){
                dif=a[j]-a[i];
                if(dif>res){
                    res=dif;
                }
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int a[]={30,10,8,2};
        max(a);
    }
    
}
