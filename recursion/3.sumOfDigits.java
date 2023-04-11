public class Main {
    public static int sumOfdigits(int number){
        if(number/10==0){
            return number;
        }
        return number%10+sumOfdigits(number/10);
    }
    public static void main(String[] args) {
        System.out.println(sumOfdigits(10000));
    }
}