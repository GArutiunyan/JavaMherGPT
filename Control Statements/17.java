import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ans = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n;i++){
            if(i%2==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}