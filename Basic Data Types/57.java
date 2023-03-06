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
public class Main {
    public static void main(String[] args) {
        Point a = new Point(5,6);
        Point b = new Point(1,5);
        double m = ((double)(a.getY()-b.getY()))/((double)(a.getX()-b.getX()));
        double c = -m*a.getX() + (double)a.getY();
        System.out.print(m+"x");
        if(c!=0) {
            if (c > 0) {
                System.out.print("+");
            }
            System.out.println(c);
        }
    }
}
