import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a<b){
            a = b;
        }
        if(a<c){
            a = c;
        }
        System.out.println(a);
    }
}