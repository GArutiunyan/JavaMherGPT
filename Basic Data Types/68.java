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
        System.out.print("x of center:");
        double a = scanner.nextDouble();
        System.out.print("y of center:");
        double b = scanner.nextDouble();
        System.out.print("Radius:");
        double r = scanner.nextDouble();
        System.out.print("(x");
        if(a>0){
            System.out.print("-");
        }else{
            System.out.print("+");
            a = -a;
        }
        System.out.print(a+")^2+(y");
        if(b>0){
            System.out.print("-");
        }else{
            System.out.print("+");
            b = -b;
        }
        System.out.print(b+")^2 = "+r*r);
    }
}
