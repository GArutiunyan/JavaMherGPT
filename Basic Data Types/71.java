import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;
        import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(x-a)^2+(y-b)^2=c");
        System.out.print("a:");
        double a = scanner.nextDouble();
        System.out.print("b:");
        double b = scanner.nextDouble();
        System.out.print("c:");
        double c = scanner.nextDouble();
        double r = Math.sqrt(c);


        System.out.print("radius: ");
        System.out.println(r);

    }
}
