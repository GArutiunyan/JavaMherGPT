import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[] a = new char[]{'x', 'c', 'c', 'x', '0', '!', '"', '^', 'Z', 'Я'};
        Map<Character,Boolean> duplicated = new HashMap<Character, Boolean>();
        System.out.println("Duplicated elements:");
        for (int i = 0; i < a.length; i++){
            if(duplicated.containsKey(a[i])){
                if(duplicated.get(a[i])){
                    System.out.println(a[i]);
                    duplicated.put(a[i],false);
                }
            }else {
                duplicated.put(a[i],true);
            }
        }
    }
}