package org.example.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Harry", 3, "22343"));
        employeeList.add(new Employee("Tim", 1, "65436"));
        employeeList.add(new Employee("John", 2, "12974"));

        System.out.println("List before sorting : " + employeeList);

        //using Comparable
        Collections.sort(employeeList);
        System.out.println("List after sorting using comparable based on id: " + employeeList);

        //for using multiple sorting logic we use comparator

        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp("Harry", 3, "22343"));
        empList.add(new Emp("Tim", 1, "65436"));
        empList.add(new Emp("John", 2, "12974"));

        System.out.println("List before sorting : " + empList);

        //using comparator class
        //sorting based on emp id
        Collections.sort(empList, new IdComparator());
        System.out.println("List after sorting using comparator based on id: " + empList);

        List<Emp> emps = new ArrayList<>(empList);
        Collections.sort(empList, new NameComparator());
        System.out.println("List after sorting using comparator based on name: " + emps);
    }
}
