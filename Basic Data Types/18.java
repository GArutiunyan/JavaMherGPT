import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int a = scanner.nextInt();
        System.out.print("Power: ");
        int n = scanner.nextInt();
        int ans = 1;
        for (int i = 1; i <= n;i++){
            ans*=a;
        }
        System.out.println(ans);
    }
}