package epam;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private int salary;
    private String place;

    public Employee(int id, String name, int salary, String place) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", place='" + place + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "uma", 30000, "bangalore"));
        employees.add(new Employee(2, "kani", 20000, "chennai"));
        employees.add(new Employee(3, "then", 10000, "coimbatore"));
        employees.add(new Employee(4, "mani", 50000, "bangalore"));

        System.out.println("collect employees grouping by place");
        Map<String, List<Employee>> map =
                employees.stream().collect(
                        Collectors.groupingBy(Employee::getPlace, Collectors.toList()));
        System.out.println(map);

        System.out.println("collect employees grouping by place and salary");
        Map<String, Map<Integer, List<Employee>>> map1 = employees.stream().collect(Collectors.groupingBy(
                Employee::getPlace, Collectors.groupingBy(Employee::getSalary, Collectors.toList())
        ));
        System.out.println(map1);

        System.out.println("max paid employee");
        employees.stream().max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);
    }
}
