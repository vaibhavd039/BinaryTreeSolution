package javamics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Collect List to Map
public class CollectToMap {
    public static void main(String [] args){
        Integer [] arr = {1,2,3,4,5,6,7};
        List<Integer> mylist = Arrays.asList(arr);
        Map<Integer, Integer> mymap = IntStream.range(0, mylist.size()).boxed().collect(Collectors.toMap(mylist::get, i->i));
        mymap.entrySet().stream().forEach(i->System.out.println(i.getKey() + " "+i.getValue()));
    }
}
