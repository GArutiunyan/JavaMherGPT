import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[] a = new int[]{1, 3, 1, 1, 2, -6, 23, 5, 3, 0};
        int[] a = new int[]{100000, 3, 1, 1, 2,0, 2, 1, 1, 3, -10000};
        Set<Integer> aset = new HashSet<Integer>();
        for(int i = 0; i < a.length; i++){
            aset.add(a[i]);
        }
        Iterator iterator = aset.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}