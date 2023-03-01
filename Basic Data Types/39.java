import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius:");
        int r = scanner.nextInt();
        System.out.print("Height:");
        int h = scanner.nextInt();
        double ans = 1.0/3*h*Math.PI*r*r;
        System.out.println(ans);
    }

}