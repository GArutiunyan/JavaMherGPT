import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[] a = new int[]{1, 3, 1, 1, 2, -6, 23, 5, 3, 0};
        int[] a = new int[]{1, 3, 1, 1, 2,0, 2, 1, 1, 3, 1};
        Boolean palindrome = true;
        int s = a.length;
        for(int i = 0; i <= s/2-1;i++){
            if(a[i]!=a[s-i-1]){
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("Array is palindrome");
        }else {
            System.out.println("Array is not palindrome");
        }
    }
}