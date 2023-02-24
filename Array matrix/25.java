import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[] a = new char[]{'a', 'b','c','x','0','!','"','^','Z','Я'};
        char max = a[0];
        char max2 = a[0];
        for (int i =0; i < a.length; i++){
            if(a[i]>max){
                if(max2!=max){
                    max2 = max;
                }
                max = a[i];
            }
        }
        System.out.println(max2);
    }
}