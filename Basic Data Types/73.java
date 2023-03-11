import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;
        import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("((x-h)^2) / (a^2)  +  ((y-k)^2) / (b^2) = 1");
        System.out.print("h: ");
        double h = scanner.nextDouble();
        System.out.print("k: ");
        double k = scanner.nextDouble();
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("x of center: ");
        System.out.println(h);
        System.out.print("y of center: ");
        System.out.println(k);
    }
}
