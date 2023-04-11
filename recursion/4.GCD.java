public class Main {
    public static int findGCD(int a,int b){
        if(a==0){
            return b;
        }
        b = b%a;
        return findGCD(b,a);
    }
    public static void main(String[] args) {
        System.out.println(findGCD(112,4412));
    }
}