package collection.sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CustomeObject {
    public static void main(String[] args) {
            Student student1=new Student(1,"Sai","pune");
            Student student2=new Student(67,"Rudra","Nashik");
            Student student3=new Student(89,"Tushar","Thane");
            Student student4=new Student(5,"Amar","Mumbai");

        List<Student> studentList=new LinkedList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        Collections.sort(studentList);
        studentList.forEach(System.out::println);
//        for(Student std:studentList){
//            System.out.println(std);
//        }
    }

}
