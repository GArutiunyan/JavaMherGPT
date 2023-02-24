class Person{
    void speak(){
        System.out.println("Speak");
    }
}
class Student extends Person{
    void study(){
        System.out.println("study");
    }

    void superSpeak(){
        super.speak();
    }
    @Override
    void speak() {
        System.out.print("Student ");
        super.speak();
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.speak();
        student.study();
        student.superSpeak();
    }
}