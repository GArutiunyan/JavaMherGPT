import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][] array = {
                new float[]{85, 540, 3, 19},
                new float[]{25, 6, 23, 31, 7, 10},
                new float[]{10, 120, 43, 135, 53}
        };

        float sum = 0;
        int n = 0;
        for(float[] i:array) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
                sum+=j;
                n++;
            }
            System.out.println();
        }
        float av = sum/n;
        System.out.println(av);

    }
}