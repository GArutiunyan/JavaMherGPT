import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][][] array = {
                {{5, 32, 3}, {4, 95, 6}, {7, 38, 91}},
                {{0, 93, 2}, {3, 1, 5}, {6, 107, 18}},
                {{109, 20, 1}, {2, 23, 24}, {5, 26, 7}}
        };
        float min = array[0][0][0];
        float max = array[0][0][0];
        for(float[][] i:array) {
            for (float[] j:i) {
                for (float k:j) {
                    System.out.printf("%4s", String.format("%.0f",k));
                    if(k > max){
                        max = k;
                    }
                    if(k<min){
                        min = k;
                    }
                }
                System.out.println();
            }
            System.out.println();System.out.println();System.out.println();
        }
        System.out.println("Max element: "+max);
        System.out.println("Min element: "+min);
        


    }
}