import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 1, 1, 2, 6, 23, 5, 3, 2};
        Map<Integer,Integer> oc = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++){
            if(oc.containsKey(a[i])){
                int cnt = oc.get(a[i]);
                oc.put(a[i],cnt+1);
            }else {
                oc.put(a[i],1);
            }
        }
        int specificElement = 1;
        System.out.println(specificElement+" occures "+oc.get(specificElement)+" times");
    }
}