import org.w3c.dom.ls.LSOutput;

class Person{
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void printNameAgeGender(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Gender: "+getGender());
    }
    public void compareAge(Person p){
        System.out.print(this.name+" ");
        if(this.age>p.getAge()){
            System.out.print("is older than ");
        } else if (this.age==p.getAge()) {
            System.out.print("is the same age as ");
        }else{
            System.out.print("is younger than ");
        }
        System.out.println(p.getName());
    }
}
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Joe Shmoe",25,"Attac Helicopter");
        Person p2 = new Person("Bob Bobson",20,"gender");
        p.compareAge(p2);
    }
}