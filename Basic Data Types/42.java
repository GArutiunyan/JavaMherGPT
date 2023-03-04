import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class Prime{
    public static boolean isPrime(int n){
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

    public static int nthPrime(int n) {
        return nthPrime(n,false);
    }
    public static int nthPrime(int n, Boolean sout) {
        int i = 1;
        while(n>0){
            i++;
            if(isPrime(i)){
                n--;
                if (sout){
                    System.out.println(i);
                }
            }
        }
        return i;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Prime.nthPrime(n));
    }

}