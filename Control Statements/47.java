import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prod = 1;
        for (int i = 1;i <= n; i++){
            if(i%7==0 && i%11==0){
                prod*=i;
            }
        }
        if (prod==1){
            prod = 0;
        }
        System.out.println(prod);
    }
}