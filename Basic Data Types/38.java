import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base:");
        int a = scanner.nextInt();
        System.out.print("Base:");
        int b = scanner.nextInt();

        int c;
        if(b>a){
            c = b;
            b = a;
            a = c;
        }
        System.out.print("Height:");
        c = scanner.nextInt();
        double ans = (b+(double)(a-b)/2)*c;
        System.out.println(ans);
    }

}