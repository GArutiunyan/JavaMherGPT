import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int fact = 1;
        for (int i = 1;i <= n; i++){
            fact *=i*2*(i*2-1);
            sum+=fact;
        }
        System.out.println(sum);
    }
}