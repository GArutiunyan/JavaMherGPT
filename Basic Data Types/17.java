import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = scanner.nextInt();
        StringBuilder binaryNumber = new StringBuilder();
        while(decimalNumber>0){
            if(decimalNumber%2==1){
                binaryNumber.append('1');
            }else {
                binaryNumber.append('0');
            }
            decimalNumber/=2;
        }
        binaryNumber.reverse();
        System.out.println(binaryNumber);
    }
}