package collection.setImpl;

import collection.sorting.Student;

import java.util.*;

public class CustomeObject {
    public static void main(String[] args) {
            Student student1=new Student(1,"Sai","pune");
            Student student2=new Student(67,"Rudra","Nashik");
            Student student3=new Student(89,"Tushar","Thane");
            Student student4=new Student(5,"Amar","Mumbai");
            Student student5=new Student(5,"Amar","Mumbai");
            Student student6=new Student(5,"Amar","Mumbai");
            Student student7=new Student(5,"Amar","Mumbai");

        Set<Student> studentList=new HashSet<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);

        for (Student str:studentList){
            System.out.println(str);
        }

    }

}
