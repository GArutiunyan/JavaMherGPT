import org.w3c.dom.ls.LSOutput;

class Rectangle{
    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,6);
        System.out.println("Length: "+r.getLength());
        System.out.println("Width: "+r.getWidth());
        System.out.println("Area: "+r.getLength()*r.getWidth());
    }

}