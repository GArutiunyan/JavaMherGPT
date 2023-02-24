import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ans = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n;i++){
            ans+=i;
        }
        ans/=n;
        System.out.println(ans);
    }
}