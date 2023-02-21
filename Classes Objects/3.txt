import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
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

        System.out.println("Name: "+s.getName());
        System.out.println("RollNumber: "+s.getRollNumber());
        List<Student.Mark> x =s.getMarks();
        System.out.println("Marks:");
        for (int i = 0; i < x.size();i++) {
            System.out.println(x.get(i).getSubject()+ " "+x.get(i).getMark());
        }
    }
}
