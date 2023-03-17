import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][] array = {{4, 20, 6}, {62, 1, 0}, {6, 5, 77}};
        float[][] array1 = new float[array[0].length][array.length];
        for(int i = 0; i<array.length; i++){
            for (int j = 0; j<array[0].length;j++){
                array1[j][i]=array[i][j];
            }
        }
        for(float[] i:array1) {
            Arrays.sort(i);
        }
        for(float[] i:array) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
            }
            System.out.println();
        }
        for(int i = 0; i<array.length; i++){
            for (int j = 0; j<array[0].length;j++){
                array[j][i]=array1[i][j];
            }
        }
        System.out.println("Sorted array (by columns): ");
        for(float[] i:array) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
            }
            System.out.println();
        }
    }
}