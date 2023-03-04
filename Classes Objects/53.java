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

    public void compareSalary(Employee e1) {

        if(salary == e1.getSalary()){
            System.out.println(name+" and "+e1.getName()+" have the same salary");
        }else {
            if (salary > e1.getSalary()) {
                System.out.print(name);
            }else{
                System.out.print(e1.getName());
            }
            System.out.println(" has bigger salary");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Hena",134234324,10000000);
        Employee e1 = new Employee("Gena",134234325,10000);
        e.printNameIdSalary();
        System.out.println();
        e1.printNameIdSalary();
        System.out.println();
        e.compareSalary(e1);
    }
}
