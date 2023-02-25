import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n;i++){
            evenSum+=i*2;
            oddSum+=i*2-1;
        }
        System.out.println("Sum of first "+n+" even: "+evenSum);
        System.out.println("Sum of first "+n+" odd: "+oddSum);
    }
}