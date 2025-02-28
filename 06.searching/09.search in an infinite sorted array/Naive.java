public class Naive {
    static int search(int a[],int x){
        int i=0;
        while(true){
            if(a[i]==x){
                return i;
            }
            if(a[i]>x){
                return -1;
            }
            i++;
        }

    }
    public static void main(String[] args) {
       //int a[]=new int[100];
        int a[]={1,12,13,14,23,25,26,45};
        int x=14;
        System.out.println(search(a,x));
    }
    
}
