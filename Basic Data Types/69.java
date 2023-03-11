import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();
        System.out.print("x3: ");
        double x3 = input.nextDouble();
        System.out.print("y3: ");
        double y3 = input.nextDouble();


        double x1sqr = x1 * x1;
        double x2sqr = x2 * x2;
        double x3sqr = x3 * x3;
        double y1sqr = y1 * y1;
        double y2sqr = y2 * y2;
        double y3sqr = y3 * y3;

        double denom = (x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2));
        double xNumerator = ((x1sqr + y1sqr) * (y2 - y3)) + ((x2sqr + y2sqr) * (y3 - y1)) + ((x3sqr + y3sqr) * (y1 - y2));
        double yNumerator = ((x1sqr + y1sqr) * (x3 - x2)) + ((x2sqr + y2sqr) * (x1 - x3)) + ((x3sqr + y3sqr) * (x2 - x1));
        double x = xNumerator / (2 * denom);
        double y = yNumerator / (2 * denom);

        double r = Math.sqrt(((x1 - x) * (x1 - x)) + ((y1 - y) * (y1 - y)));

        System.out.println("(x - (" + x + "))^2 + (y - (" + y + "))^2 = " + (r * r));

    }

}