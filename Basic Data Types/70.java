import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;
        import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(x-a)^2+(y-b)^2=r^2");
        System.out.print("a:");
        double a = scanner.nextDouble();
        System.out.print("b:");
        double b = scanner.nextDouble();
        System.out.print("r:");
        double r = scanner.nextDouble();


        System.out.print("x of center: ");
        System.out.println(a);
        System.out.print("y of center: ");
        System.out.println(b);

    }
}
