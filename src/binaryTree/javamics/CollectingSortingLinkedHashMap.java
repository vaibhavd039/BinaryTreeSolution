package binaryTree.javamics;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectingSortingLinkedHashMap {
    public static void main(String[] args) {
        List<Student> studentList = new LinkedList<>();
        Student st1 = new Student(1, "vaibhav", "Delhi");
        Student st2 = new Student(2, "aibhav", "elhi");
        Student st3 = new Student(3, "ibhav", "lhi");
        Student st4 = new Student(4, "hav", "hi");
        Student st5 = new Student(5, "bhav", "i");
        Map<Student, Integer> mymap = IntStream.range(0, studentList.size()).boxed().collect(Collectors.toMap(studentList::get, i -> i));
        mymap.entrySet().stream().sorted((i1, i2) -> i1.getKey().name.compareTo(i2.getKey().name)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)->e1, LinkedHashMap::new));

    }
}
