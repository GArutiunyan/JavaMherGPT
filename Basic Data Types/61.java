import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return ""+x+" "+y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("slope");
        double m = scanner.nextDouble();
        System.out.println("Point x:");
        double x =scanner.nextDouble();
        System.out.println("Point y:");
        double y =scanner.nextDouble();
        Point a = new Point(x,y);
        double c = -m*a.getX() + (double)a.getY();
        System.out.print("x intercept: ");
        System.out.println((-c)/m);
        System.out.print("y intercept: ");
        System.out.println(c);

//        Point a = new Point(x,0);
//        Point b = new Point(0,y);
//        double m = ((double)(a.getY()-b.getY()))/((double)(a.getX()-b.getX()));
//        double c = -m*a.getX() + (double)a.getY();
//        System.out.print(m+"x");
//        if(c!=0) {
//            if (c > 0) {
//                System.out.print("+");
//            }
//            System.out.println(c);
//        }
    }
}
