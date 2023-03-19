import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][][] array = {
                {{5, 32, 3}, {4, 95, 6}, {7, 38, 91}},
                {{0, 93, 2}, {3, 1, 5}, {6, 107, 18}},
                {{109, 20, 1}, {2, 23, 24}, {5, 26, 7}}
        };
        float sum = 0;
        int n = 0;
        for(float[][] i:array) {
            for (float[] j:i) {
                for (float k:j) {
                    System.out.printf("%4s", String.format("%.0f",k));
                    sum+=k;
                    n++;
                }
                System.out.println();
            }
            System.out.println();System.out.println();System.out.println();
        }
        float av = sum/n;
        System.out.println("Average of elements: "+av);



    }
}