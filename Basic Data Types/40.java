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
        double l = Math.sqrt(r*r+h*h);
        double ans = Math.PI*r*(r+l);
        System.out.println(ans);
    }

}