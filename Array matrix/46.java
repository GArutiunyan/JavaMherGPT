import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[] a = new int[]{1, 3, 1, 1, 2, -6, 23, 5, 3, 0};
        int[] a = new int[]{100000, 3, 1, 1, 2,0, 2, 1, 1, 3, -10000};
        int largest = a[0];
        int smallest = a[0];
        int ans = 0;
        for(int i = 0; i < a.length;i++){
            if(a[i]>largest){
                largest = a[i];
            }
            if(a[i]<smallest){
                smallest=a[i];
            }
            ans+=a[i];
        }
        ans-=smallest+largest;
        System.out.println(ans);

    }
}