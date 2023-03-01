import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
    private String name;
    private int employeeId;
    private int salary;

    public Employee(String name, int employeeId, int salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printNameIdSalary() {
        System.out.println("Name: "+ getName());
        System.out.println("Id: "+ getEmployeeId());
        System.out.println("Salary: "+ getSalary());
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Hena",134234324,10000000);
        e.printNameIdSalary();
    }
}
