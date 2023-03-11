import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if(a==b&& b==c&&c==d){
            System.out.println("All are equal");
        }else {
            if (a < b) a = b;
            if (a < c) a = c;
            if (a < d) a = d;
            System.out.println(a);
        }
    }
}