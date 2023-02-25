import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius: ");
        double r = scanner.nextInt();
        System.out.print("Height: ");
        double h = scanner.nextInt();
        double ans = 0;
        ans = Math.PI*r*r*h;
        System.out.println(ans);

    }

}