import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int odd = 1;
        for (int i = 1;i <= n; i++){
            odd = i*2-1;
            sum+=odd*odd;
        }
        System.out.println(sum);
    }
}