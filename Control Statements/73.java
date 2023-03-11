import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prod = 1;
        for(int i = 1; i <=n;i++){
            if(i%2==0||i%3==0||i%4==0) {
                prod*=i;
            }
        }
        if(prod == 1){
            prod = 0;
        }
        System.out.println(prod);
    }
}