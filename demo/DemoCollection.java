package demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoCollection {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.sort((a,b)->b-a);
        System.out.println(list);


        List<Employee> employees=new ArrayList<>();
        Employee emp1=new Employee("samar" ,1000,1);
        Employee emp2=new Employee("doe",500,2);
        Employee emp3=new Employee("john",700,3);
        Employee emp4=new Employee("alice",900,4);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

//      employees.sort((a,b)->(int)b.getSalary()-(int)a.getSalary());
        Comparator<Employee> cmp=Comparator
                .comparingInt(
                        (Employee a)->a.getName().length())
                .thenComparing(Employee::getSalary,Comparator.reverseOrder());
        employees.sort(cmp);
        for(Employee emp:employees)
            System.out.println(emp);
    }
}
