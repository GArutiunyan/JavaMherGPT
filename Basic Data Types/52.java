import java.util.Scanner;


class GCD{
    public static int gcd(int x, int y){
        if(x<y){
            return gcd(y,x);
        }
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(GCD.gcd(a,b));
    }
}