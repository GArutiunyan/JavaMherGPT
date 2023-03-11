import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ans = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0){
            for (int i = 0; i < n; i++) {
                ans+=n;
            }
        }
        System.out.println(ans);
    }
}