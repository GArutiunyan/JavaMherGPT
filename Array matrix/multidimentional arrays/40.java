import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][] array = {
                new float[]{85, 540, 3, 19},
                new float[]{25, 6, 23, 31, 7, 10},
                new float[]{10, 120, 43, 135, 53}
        };

        for(float[] i:array) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
            }
            Arrays.sort(i);
            System.out.println();
        }
        System.out.println("Sorted rows:");
        for(float[] i:array) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
            }
            Arrays.sort(i);
            System.out.println();
        }
    }
}