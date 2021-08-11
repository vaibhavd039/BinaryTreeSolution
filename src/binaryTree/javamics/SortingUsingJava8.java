package binaryTree.javamics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingUsingJava8 {
    public static  void main(String [] args) {
        List<Student1> stringList = new LinkedList<>();
        Student1 st1 =new Student1(1, "vaibhav", "Delhi");
        Student1 st2 = new Student1(2, "aibhav", "elhi");
        Student1 st3 = new Student1(3, "ibhav", "lhi");
        Student1 st4 = new Student1(4, "hav", "hi");
        Student1 st5 = new Student1(5, "bhav", "i");
        stringList.add(st5);
        stringList.add(st4);
        stringList.add(st3);
        stringList.add(st2);
        stringList.add(st1);
        Collections.sort(stringList, (Student1 obj1, Student1 obj2)->obj1.name.compareTo(obj2.name));
        stringList.stream().forEach(System.out::println);
    }

}

class Student1{
    int rollNo;
    String name;
    String city;
    Student1(int roll, String name , String city){
        this.rollNo = roll;
        this.name = name;
        this.city  = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

