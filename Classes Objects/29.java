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
class Triangle{
    private List<Point> points;

    public Triangle(int x1, int y1,int x2, int y2,int x3, int y3) {
        this(new Point(x1,y1),new Point(x2,y2),new Point(x3,y3));
    }

    public Triangle(Point a, Point b, Point c) {
        points = new ArrayList<Point>();
        points.add(a);
        points.add(b);
        points.add(c);
    }

    public List<Point> getPoints() {
        return Collections.unmodifiableList(points);
    }
}
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,4,4,1,5,1);
        List<Point> points = triangle.getPoints();
        System.out.println("Triangle points");
        for(Point p: points){
            System.out.println(p);
        }
        System.out.print("Area: ");

        double ans = (1.0/2.0)*Math.abs(
                points.get(0).getX()*(points.get(1).getY()-points.get(2).getY())+
                        points.get(1).getX()*((points.get(2)).getY()-points.get(0).getY())+
                points.get(2).getX()*(points.get(0).getY()-points.get(1).getY()));
        System.out.println(ans);

    }
}
