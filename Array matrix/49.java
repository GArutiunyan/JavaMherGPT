import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 1, 1, 2, -6, 23, 5, 3, 0};
        int[] b = new int[]{100000, 3, 1, 1, 2,0, 2, 1, 1, 3, -10000};
        Set<Integer> aset = new HashSet<Integer>();
        Set<Integer> cset = new HashSet<Integer>();
        for(int i = 0; i < a.length; i++){
            aset.add(a[i]);
            cset.add(a[i]);
        }
        Set<Integer> bset = new HashSet<Integer>();
        for(int i = 0; i < b.length; i++){
            bset.add(b[i]);
            cset.add(b[i]);
        }
        System.out.println("Intersection:");
        Iterator iterator = bset.iterator();
        while (iterator.hasNext()){
            Integer x = (Integer) iterator.next();
            if(aset.contains(x)){
                System.out.print(x+" ");
            }
        }
        System.out.println();
        System.out.println("Union:");
        iterator = cset.iterator();
        while (iterator.hasNext()){
            System.out.print((Integer) iterator.next()+" ");
        }
    }
}