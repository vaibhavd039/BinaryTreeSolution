package javamics;

import java.util.HashMap;
import java.util.Map;

//iterate maps
public class IterateMap {
    public static void main(String [] args){
    Map<Integer, Integer> mymap = new HashMap<>();
        mymap.put(1,101);
        mymap.put(2,102);
        mymap.put(3,103);
        mymap.put(4,104);
        mymap.put(5,105);
        mymap.put(6,106);
        mymap.entrySet().stream().forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
    }
}
