import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[] a = new char[]{'a', 'c', 'c', 'x', '0', '!', '"', '^', 'Z', 'Я'};
        Map<Character,Integer> oc = new HashMap<Character, Integer>();
        for (int i = 0; i < a.length; i++){
            if(oc.containsKey(a[i])){
                int cnt = oc.get(a[i]);
                oc.put(a[i],cnt+1);
            }else {
                oc.put(a[i],1);
            }
        }
        int max = 1;
        char ans = a[0];
        for (char i:a){
            int x = oc.get(i);
            if(x>max){
                max = x;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}