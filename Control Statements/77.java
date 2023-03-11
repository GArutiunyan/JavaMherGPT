import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        int sum = 0;
        for (int i = 1;i <= n; i++){
            fact*=i;
            if(i%3==0&&i%5==0&&i%7==0){
                sum+=fact;
            }
        }
        System.out.println(sum);
    }
}