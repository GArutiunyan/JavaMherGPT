import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a;
        if(a < b){
            a = b;
            b = x;
        }
        while (b>0){
            a%=b;
            x = a;
            a = b;
            b = x;
        }
        System.out.println(a);
    }
}