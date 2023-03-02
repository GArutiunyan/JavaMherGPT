import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 1, 1, 2, -6, 23, 5, 3, 0};
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i]>0){
                positive++;
            }
            if(a[i]<0){
                negative++;
            }
        }
        System.out.println("Positive: "+positive);
        System.out.println("Negative: "+negative);
        System.out.println("Zero: "+(a.length-positive-negative));
    }
}