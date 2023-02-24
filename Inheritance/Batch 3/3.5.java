class Employee{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    void work(){
        System.out.println(name+" works");
    }
}

class Manager extends Employee{
    private String bonus;

    public Manager(String name, int salary, String bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString()+" Manager{" +
                "bonus='" + bonus + '\'' +
                '}';
    }
    void delegate(Employee e){
        System.out.print(getName()+" delegates - ");
        e.work();
    }

    public String superToString() {
        return super.toString();
    }
}


public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John",10000,"Coffee");
        System.out.println(manager);
        Employee e = new Employee("Sam",1000);
        System.out.println(e);
        e.work();
        manager.work();
        manager.delegate(e);


        System.out.println(manager);
        System.out.println(manager.superToString());

    }
}