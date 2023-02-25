import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] binaryNumber = scanner.nextLine().toCharArray();
        int ans = 0;
        int x = 1;
        for(int i = binaryNumber.length-1; i>=0; i--){
            if(binaryNumber[i]!='0'){
                ans+=x;
            }
            x*=2;
        }
        System.out.println(ans);
    }
}