import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;
        import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x of center:");
        double x = scanner.nextDouble();
        System.out.print("y of center:");
        double y = scanner.nextDouble();
        System.out.print("Major axis length:");
        double a = scanner.nextDouble();
        a/=2;
        System.out.print("Minor axis length:");
        double b = scanner.nextDouble();
        b/=2;
        System.out.print("((x- ("+x+") )^2) / ("+a+"^2)  +  ((y- ("+y+") )^2) / ("+b+"^2) = 1");

    }
}
