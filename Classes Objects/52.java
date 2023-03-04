import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student{
    public void printNameRollNumberMarks() {
        System.out.println("Name: "+getName());
        System.out.println("RollNumber: "+getRollNumber());
        List<Student.Mark> x =getMarks();
        System.out.println("Marks:");
        for (int i = 0; i < x.size();i++) {
            System.out.println(x.get(i).getSubject()+ " "+x.get(i).getMark());
        }
    }

    public void compareMarks(Student s1) {
        Iterator iterator = marks.iterator();
        double student1GPA = 0;
        while(iterator.hasNext()){
            Mark x = (Mark) iterator.next();
            student1GPA = student1GPA + x.getMark();
        }
        student1GPA=student1GPA/marks.size();

        iterator = s1.getMarks().iterator();
        double student2GPA = 0;
        while(iterator.hasNext()){
            Mark x = (Mark) iterator.next();
            student2GPA = student2GPA + x.getMark();
        }
        student2GPA=student2GPA/s1.getMarks().size();
        System.out.println("Strudent 1 average: "+student1GPA);
        System.out.println("Strudent 2 average: "+student2GPA);
        if(student1GPA>student2GPA){
            System.out.print("Student 1");
        }
        if(student1GPA<student2GPA){
            System.out.print("Student 2");
        }
        if(student1GPA!=student2GPA)
        System.out.println(" has better grades.");
    }

    class Mark{
        private int mark;
        private String subject;

        public Mark(int mark, String subject) {
            this.mark = mark;
            this.subject = subject;
        }

        public int getMark() {
            return mark;
        }

        public void setMark(int mark) {
            this.mark = mark;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }
    }
    private String name;
    private int rollNumber;
    private List<Mark> marks;


    public void addMark(int mark, String subject){
        marks.add(new Mark(mark, subject));
    }

    public List<Mark> getMarks() {
        return Collections.unmodifiableList(marks);
    }

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        marks = new ArrayList<Mark>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }


}
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Gena",1000123);
        s.addMark(5,"Art");
        s.addMark(0,"Math");
        Student s1 = new Student("Pena",1000124);
        s1.addMark(4,"Art");
        s1.addMark(3,"Math");
        s.printNameRollNumberMarks();
        System.out.println();
        s1.printNameRollNumberMarks();
        System.out.println();
        s.compareMarks(s1);
    }
}
