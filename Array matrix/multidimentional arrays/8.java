import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][] array = {{4, 20, 6}, {62, 1, 0}, {6, 5, 77}};
        float maindiagonal = 0;
        float secondarydiagonal = 0;
        int ind = 0;
        int n = array.length;
        for(float[] i:array) {
            maindiagonal+=i[ind];
            secondarydiagonal+=i[n-ind-1];
            ind++;
        }
        for(float[] i:array) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
            }
            System.out.println();
        }
        System.out.println("Main diagonal sum: "+maindiagonal);
        System.out.println("Secondary diagonal sum: "+secondarydiagonal);
    }
}