import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[] a = new int[]{1, 3, 1, 1, 2, -6, 23, 5, 3, 0};
        int[] a = new int[]{1, 3, 1, 1, 2,0, 2, 1, 1, 3, 1};
        int odd = 0;
        int even = 0;
        for(int i = 0; i < a.length;i++){
            if(a[i]%2==0){
                even+=a[i];
            }else {
                odd+=a[i];
            }
        }
        System.out.println(Math.abs(odd-even));

    }
}