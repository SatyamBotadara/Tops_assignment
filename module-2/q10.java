import java.util.HashMap;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();

        hm.put("Gujarat", "Botad");
        hm.put("Maharashtra", "Mumbai");
        
        for(String name:hm.keySet())
        {
            System.out.println(" "+name+"->"+hm.get(name));
        }

    }
    
}
