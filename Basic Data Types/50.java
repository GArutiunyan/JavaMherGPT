import java.util.*;
import java.util.function.Consumer;

class FibN{
    public static int fibn(int n){
        if(n<1){
            return 0;
        }
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fibn(n-2)+fibn(n-1);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(FibN.fibn(n));
    }

}