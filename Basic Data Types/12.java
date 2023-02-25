import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 1;
        for(int i = 1; i <= x; i++){
            ans*=i;
        }
        System.out.println(x+"! = "+ans);
    }
}