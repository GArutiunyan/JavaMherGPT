import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[] a = new char[]{'a', 'b', 'c', 'x', '0', '!', '"', '^', 'Z', 'Я'};
        char[] b = new char[]{'a', 'b', 'c', 'x', '0', '"', '^', 'Z', 'Я'};

        Set<Character> bset = new HashSet<>();
        for (int i = 0; i < b.length; i++){
            bset.add(b[i]);
        }
        System.out.println("Missing in b:");
        for (int i = 0; i < a.length; i++){
            if (!bset.contains(a[i])){
                System.out.println(a[i]);
            }
        }
    }
}