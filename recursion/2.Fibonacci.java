public class Main {

    public static int calculateNthFibonacciNumber(int n){
        if(n == 1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return calculateNthFibonacciNumber(n-1)+calculateNthFibonacciNumber(n-2);
    }

    public static void main(String[] args) {
        System.out.println(calculateNthFibonacciNumber(5));
    }
}