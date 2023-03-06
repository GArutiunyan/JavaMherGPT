import java.util.*;
import java.util.function.Consumer;

class Sum{
    public static int sum(int i){
        if(i==1){
            return 1;
        }
        return sum(i-1)+i;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Sum.sum(n));
    }

}