import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> m=new HashMap<>();
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("course", 20);
        System.out.println(m);
        System.out.println("size is "+m.size());
        for(Map.Entry<String,Integer> e:m.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        if(m.containsKey("ide1")){
            System.out.println("contain ide ");
        }
        else {
            System.out.println("not contain ide");
        }
        if(m.containsValue(15)){
            System.out.println("contain 15 ");
        }
        else {
            System.out.println("not contain 15");
        }
        m.remove("ide");
        System.out.println("after remove ide "+m.size());
        if(m.containsValue(15)){
            System.out.println("contain 15 ");
        }
        else {
            System.out.println("not contain 15");
        }
        //get() give value to the corresponding key
        System.out.println(" get method ide "+m.get("ide"));
        System.out.println(" get method gfg "+m.get("gfg"));
    }
}
