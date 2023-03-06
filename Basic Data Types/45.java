import java.util.*;
import java.util.function.Consumer;


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
        boolean palindromic = true;
        int size = digits.size();
        for(int i= 0; i < size/2;i++){
            if(digits.get(i)!=digits.get(size-i-1)){
                palindromic = false;
                break;
            }
        }
        if(palindromic){
            System.out.println("This number is palindromic");
        }else {
            System.out.println("This number is not palindromic");
        }
    }

}