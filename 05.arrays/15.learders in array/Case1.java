public class Case1 {
    static void learder(int a[]){
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<=a[j]){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int a[]={30,20,10};
        learder(a);
    }
    
}
