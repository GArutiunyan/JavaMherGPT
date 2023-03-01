import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> hashSet = new HashSet<Integer>();
        for(int i = 0; i < 3; i++){
            hashSet.add(scanner.nextInt());
        }
        System.out.println(Collections.min(hashSet));
    }

}