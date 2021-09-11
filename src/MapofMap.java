import java.util.HashMap;
import java.util.Map;

public class MapofMap {
    public static void main(String[] args) {
        Map<String, Map<String, String>> myMap = new HashMap<>();
        Map<String, String> mymap1 = new HashMap<>();
        mymap1.put("1", "Vaibhav");
        myMap.put("abc", mymap1);
        myMap.forEach((key, value) -> {
            value.forEach((innerkey, innerValue) -> {System.out.println(innerkey.toString() + " " + innerValue.toString());}  );
        });
    }
}

