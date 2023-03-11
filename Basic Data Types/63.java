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
        System.out.println("1)");
        System.out.print("x:");
        double x1 = scanner.nextDouble();
        System.out.print("y:");
        double y1 = scanner.nextDouble();
        System.out.println("2)");
        System.out.print("x:");
        double x2 = scanner.nextDouble();
        System.out.print("y:");
        double y2 = scanner.nextDouble();
        System.out.println("3)");
        System.out.print("x:");
        double x3 = scanner.nextDouble();
        System.out.print("y:");
        double y3 = scanner.nextDouble();


        double denom = (x1-x2) * (x1-x3) * (x2-x3);
        double a     = (x3 * (y2-y1) + x2 * (y1-y3) + x1 * (y3-y2)) / denom;
        double b     = (x3*x3 * (y1-y2) + x2*x2 * (y3-y1) + x1*x1 * (y2-y3)) / denom;
        double c     = (x2 * x3 * (x2-x3) * y1+x3 * x1 * (x3-x1) * y2+x1 * x2 * (x1-x2) * y3) / denom;
        System.out.print("y = "+a+"*x^2 ");
        if(b>0){
            System.out.print("+");
        }
        System.out.println(b+"*x + "+c);

    }
}
