import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

class Point{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(5,6);
        Point point2 = new Point(2,1);
        System.out.println("Point1: "+point1.getX()+", "+point1.getY());
        System.out.println("Point2: "+point2.getX()+", "+point2.getY());
        System.out.print("Distance: ");
        double a = point1.getX() - point2.getX();
        double b = point1.getY() - point2.getY();
        double ans = Math.sqrt(a*a+b*b);
        System.out.println(ans);


    }

}
