import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][][] array = {
                {{5, 32, 3}, {4, 95, 6}, {7, 38, 91}},
                {{0, 93, 2}, {3, 1, 5}, {6, 107, 18}},
                {{109, 20, 1}, {2, 23, 24}, {5, 26, 7}}
        };
        float diagonal1 = 0;
        float diagonal2 = 0;
        float diagonal3 = 0;
        float diagonal4 = 0;
        int n = array.length;
        for(int i = 0; i < n; i++){
            diagonal1+=array[i][i][i];
            diagonal2+=array[i][i][n-1-i];
            diagonal3+=array[n-1-i][i][i];
            diagonal4+=array[n-1-i][i][n-1-i];

        }

        for(float[][] i:array) {
            for (float[] j:i) {
                for (float k:j) {
                    System.out.printf("%4s", String.format("%.0f",k));
                }
                System.out.println();
            }
            System.out.println();System.out.println();System.out.println();
        }


        System.out.println("Diagonal 1 sum: "+diagonal1);
        System.out.println("Diagonal 2 sum: "+diagonal2);
        System.out.println("Diagonal 3 sum: "+diagonal3);
        System.out.println("Diagonal 4 sum: "+diagonal4);

    }
}