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

    @Override
    public String toString() {
        return ""+x+" "+y;
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
class Circle {

    int radius;
    Point center;

    public Circle(int radius, int x, int y) {
        this(radius, new Point(x,y));
    }
    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double calculateCircumference() {
        return 2*Math.PI*radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(1,5,6);
        System.out.println("Center location: "+c.getCenter());
        System.out.println("Radius: "+c.getRadius());
        System.out.println("Circumference: "+c.calculateCircumference());
    }
}
