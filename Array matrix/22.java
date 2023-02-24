import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[] a = new char[]{'a', 'b','c','x','0','!','"','^','Z','Я'};
        int ans = a[0];
        for (int i = 1; i < a.length; i++){
            ans+=a[i];
        }
        ans/=a.length;
        System.out.println(ans);
    }
}