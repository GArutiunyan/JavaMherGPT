import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[] a = new char[]{'a', 'a', 'c', 'x', '0', '!', '"', '^', 'Z', 'Я'};
        List<Character> b = new ArrayList<Character>();
        for(int i = 0; i < a.length; i++){
            b.add(a[i]);
        }
        Collections.sort(b);
        int s = b.size();
        double ans = b.get(s/2);
        if(s%2==1){
            ans+=b.get(s/2+1);
            ans/=2.0;
        }
        System.out.println((char) ans);
    }
}