import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("slope");
        double m = scanner.nextDouble();
        System.out.println("y intercept");
        double c = scanner.nextDouble();
//        Point a = new Point(x,0);
//        Point b = new Point(0,y);
//        double m = ((double)(a.getY()-b.getY()))/((double)(a.getX()-b.getX()));
//        double c = -m*a.getX() + (double)a.getY();
        System.out.print(m+"x");
        if(c!=0) {
            if (c > 0) {
                System.out.print("+");
            }
            System.out.println(c);
        }
    }
}
