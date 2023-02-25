import java.util.Scanner;

class FibCount{
    private int ans = 0;
    FibCount(int cnt){
        System.out.print("0");
        fib(0,1,cnt-1);
    }
    private void fib(int a, int b, int cnt){
        if(cnt==0){
            System.out.print(" = ");
            return;
        }
        System.out.print("+"+b);
        ans+=b;
        fib(b,a+b,cnt-1);
    }
    @Override
    public String toString() {
        return ""+ans;
    }
}
public class Main {
    int ans = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        FibCount fibCount = new FibCount(n);
        System.out.println(fibCount);
    }

}