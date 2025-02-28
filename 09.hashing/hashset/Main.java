import java.util.*;
public class Main  {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();
        h.add("gfg");
        h.add("course");
        h.add("ide");
        System.out.println("print h values "+h);
        System.out.println("hash set contain ide "+h.contains("ide"));
        //just like for loop
        Iterator<String> i=h.iterator();
        //print first ele in iterator
       // System.out.println(i.next());
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println(" ");
        System.out.println("size is "+h.size());
        h.remove("ide");
        System.out.println("after remove ide size is "+h.size());
        //another simple way of create iteration
        for(String s:h){
            System.out.print(s+" ");
        }
        System.out.println("\n"+h.isEmpty());
        h.add("dsa");
        System.out.println("size is "+h.size());
        h.clear();
        System.out.println("after clear "+h.size());
    }
}
