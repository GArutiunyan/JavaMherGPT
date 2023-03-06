import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        List<Byte> digits = new LinkedList<Byte>();
        long number1 = number;
        while(number1>0){
            digits.add((byte) (number1%10));
            number1/=10;
        }

        int ans = digits.stream().mapToInt(i->i).sum();
        System.out.println(ans);


    }

}