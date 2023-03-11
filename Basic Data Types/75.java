import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;
        import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("center x: ");
        int x = scanner.nextInt();
        System.out.print("center y: ");
        int y = scanner.nextInt();
        System.out.print("Semi-major axis length: ");
        int a = scanner.nextInt();
        System.out.print("Semi-minor axis length: ");
        int b = scanner.nextInt();
        System.out.println(String.format("((x-%d)^2/%d) - ((y-%d)^2/%d) = 1", x, a*a, y, b*b));
    }
}
