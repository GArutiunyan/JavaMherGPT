public class Main {
    public static int calculateFactorial(int n){
        if(n==1){
            System.out.println(1);
            return 1;
        }
        int ans = calculateFactorial(n-1)*n;
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        calculateFactorial(10);
    }
}