package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//  Find maximum salary from a list of employees.
/*
        Create a class, and assign the values,
        create multiple object
 */
public class Employee {

    private String name;
    private int salary;

    public Employee (String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public static void main(String[] args) {

    List<Employee> employees =
            Arrays.asList(
                    new Employee("Harsh", 50000),
                    new Employee("John", 80000),
                    new Employee("Raj", 60000)
            );
    Employee maxSal = employees.stream()
            .max(Comparator.comparing(Employee::getSalary))
            .get();
        System.out.println("Highest salary :" +maxSal.getName());

    }

    /*
          Whenever you see:

            Find highest ...
            Find lowest ...
            Find longest ...
            Find shortest ...
            Find youngest ...
            Find oldest ...

            use

            Highest salary.max(Comparator.comparing(Employee::getSalary))
            Youngest employee.min(Comparator.comparing(Employee::getAge))
            Longest string.max(Comparator.comparing(String::length))
            Shortest string.min(Comparator.comparing(String::length))
     */

}
