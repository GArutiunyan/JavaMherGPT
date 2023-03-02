import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 1, 1, 2, 6, 23, 5, 3, 2};
        int specificElement = 1;
        int ans = -1;
        for(int i = 0; i < a.length; i++){
            if(a[i]==specificElement){
                ans = i;
                break;
            }
        }
        if(ans!=-1) {
            System.out.println(specificElement + " is at index " + ans);
        }else{
            System.out.println("Element not found");
        }
    }
}