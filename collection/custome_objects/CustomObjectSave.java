package collection.custome_objects;

import java.util.ArrayList;
import java.util.function.Consumer;

public class CustomObjectSave {
    public static void main(String[] args) {
        Employee employee1=new Employee(1,"Sahil",2000);
        Employee employee2=new Employee(22,"Rudra",5000);
        Employee employee3=new Employee(56,"Siddhi",679);
        Employee employee4=new Employee(67,"Riddhi",6000);

        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);

        System.out.println("Object is stored in array list -->"+employeeArrayList);


//       Print Employee Details who salary is >4000
        for (Employee employee:employeeArrayList){
            if (employee.getSalary()>4000){
                System.out.println(employee);
            }
        }

//        using forEach
        Consumer<Employee> consumer=(employee -> {
            if (employee.getSalary()>4000){
                System.out.println(employee);
            }
        });
        employeeArrayList.forEach(consumer);
    }
}
