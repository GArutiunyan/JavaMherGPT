import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class Prime{
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        if(n<4){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i = 5; i*i<=n;i+=6) {

            if (n % i == 0 || n % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number++;
        while (!Prime.isPrime(number)){
            number++;
        }
        System.out.println(number);
    }

}