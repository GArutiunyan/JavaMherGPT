import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input feet:");
        int feet = scanner.nextInt();
        System.out.print("Input inches:");
        int inches = scanner.nextInt();
        System.out.println(feet*12+inches+" inches");



    }
}