import java.util.*;
import java.util.function.Consumer;

class Pow{
    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }
        return pow(x,n-1)*x;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("power: ");
        int p = scanner.nextInt();
        System.out.println(Pow.pow(x,p));
    }

}