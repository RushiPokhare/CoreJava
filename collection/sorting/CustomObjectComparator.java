package collection.sorting;

import java.util.*;

public class CustomObjectComparator {
    public static void main(String[] args) {
        Employee employee1=new Employee(1,"Rudra",60000);
        Employee employee2=new Employee(67,"Akshay",50000);
        Employee employee3=new Employee(58,"Sid",3000);
        Employee employee4=new Employee(90,"Rushi",80000);

        List<Employee> employeeList=new LinkedList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

//        Comparator<Employee> idComparator=(e1,e2)->e1.getId()-e2.getId();
//        Comparator<Employee> SalaryComparator=(e1,e2)->e1.getSalary()-e2.getSalary();
        Comparator<Employee> NameComparator=(e1,e2)->e1.getName().compareTo(e2.getName());
        Collections.sort(employeeList,NameComparator);
        employeeList.forEach(System.out::println);  //if you want to short based on ID


    }
}
