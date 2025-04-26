package collection.sorting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Student implements Comparable<Student> {
    int id;
    String name;
    String address;


    @Override
    public int compareTo(Student student) {
//        return this.id-student.id;  //<--Shorting Based on Student ID
        return this.name.compareTo(student.name);
    }
}
