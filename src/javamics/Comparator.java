package javamics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Comparator {
    public static  void main(String [] args){
        List<Student> stringList = new LinkedList<>();
        Student st1 = new Student(1,"vaibhav", "Delhi");
        Student st2 = new Student(2,"aibhav", "elhi");
        Student st3 = new Student(3,"ibhav", "lhi");
        Student st4 = new Student(4,"hav", "hi");
        Student st5 = new Student(5,"bhav", "i");
        stringList.add(st5);
        stringList.add(st4);
        stringList.add(st3);
        stringList.add(st2);
        stringList.add(st1);
        class MyComparator implements java.util.Comparator<Student>{
            @Override
            public int compare(Student o1, Student o2) {
              return o1.name.compareTo(o2.name);
            }
        }
        Collections.sort(stringList, new MyComparator());
        stringList.stream().forEach(i->System.out.println(i.toString()));

    }
}
class Student{
    int rollNo;
    String name;
    String city;
    Student(int roll, String name , String city){
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
