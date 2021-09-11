import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExp {
    public static void main(String [] args){
        List<List<String>> hello = new LinkedList<>();
        hello.add(Collections.singletonList("Vaibhav"));
        hello.add(Collections.singletonList("Dubey"));
        hello.add(Collections.singletonList("Harshita"));
        hello.add(Collections.singletonList("pathak"));
        
        List<String> mylist= hello.stream().flatMap(x->x.stream().map(y->y.toUpperCase())).collect(Collectors.toList());
        mylist.forEach(System.out::println);
    }
    
}
