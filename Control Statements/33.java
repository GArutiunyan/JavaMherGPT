import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ans = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        for(int i = 1; i <= n;i++){
            fact*=i;
            ans+=fact;
        }
        System.out.println(ans);
    }
}