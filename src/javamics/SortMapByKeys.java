package javamics;

import java.util.HashMap;
import java.util.Map;

public class SortMapByKeys {
    public static void main(String [ ] args){
        Map<Integer, Integer> mymap = new HashMap<>();
        mymap.put(1,101);
        mymap.put(2,102);
        mymap.put(4,104);
        mymap.put(5,105);
        mymap.put(6,106);
        mymap.put(3,103);
        mymap.entrySet().stream().sorted((i1,i2)->i1.getKey().compareTo(i2.getKey())).forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
    }

}
