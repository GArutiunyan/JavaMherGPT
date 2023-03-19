import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][][] array = {
                {{5, 32, 3}, {4, 95, 6}, {7, 38, 91}},
                {{0, 93, 2}, {3, 1, 5}, {6, 107, 18}},
                {{109, 20, 1}, {2, 23, 24}, {5, 26, 7}}
        };
        float[][][] array1 = new float[array.length][array[0][0].length][array[0].length];
        int ind = 0;
        for(float[][] a:array) {
            for(int i = 0; i < a.length;i++){
                for(int j = 0; j < a[0].length;j++){
                    array1[ind][j][i] = a[i][j];
                }
            }
            ind++;
        }
        float[][][] array2 = new float[array[0][0].length][array[0].length][array.length];
        for(int i = 0; i < array.length;i++){
            int m=array[0].length;
            int n = array[0][0].length;
            for(int j = 0; j< m;j++){
                for (int k = 0; k < n;k++){
                    array2[k][j][m-1-i]=array[i][j][k];
                }
            }
        }


        System.out.println("Original array: ");


        for(float[][] i:array) {
            for (float[] j:i) {
                for (float k:j) {
                    System.out.printf("%4s", String.format("%.0f",k));
                }
                System.out.println();
            }
            System.out.println();System.out.println();System.out.println();
        }


        for(float[][] i:array) {
            for (float[] j:i) {
                Arrays.sort(j);
            }
        }
        for(float[][] i:array1) {
            for (float[] j:i) {
                Arrays.sort(j);
            }
        }
        for(float[][] i:array2) {
            for (float[] j:i) {
                Arrays.sort(j);
            }
        }

        float[][][] array10 = new float[array.length][array[0][0].length][array[0].length];
        ind = 0;
        for(float[][] a:array1) {
            for(int i = 0; i < a.length;i++){
                for(int j = 0; j < a[0].length;j++){
                    array10[ind][j][i] = a[i][j];
                }
            }
            ind++;
        }
        float[][][] array20 = new float[array[0][0].length][array[0].length][array.length];
        for(int i = 0; i < array.length;i++){
            int m=array[0].length;
            int n = array[0][0].length;
            for(int j = 0; j< m;j++){
                for (int k = 0; k < n;k++){
//                    array20[k][j][m-1-i]=array2[i][j][k];
                    array20[n-1-k][j][i]=array2[i][j][k];
                }
            }
        }


        System.out.println("Sorted rows: ");


        for(float[][] i:array) {
            for (float[] j:i) {
                for (float k:j) {
                    System.out.printf("%4s", String.format("%.0f",k));
                }
                System.out.println();
            }
            System.out.println();System.out.println();System.out.println();
        }

        System.out.println("Sorted cols: ");


        for(float[][] i:array10) {
            for (float[] j:i) {
                for (float k:j) {
                    System.out.printf("%4s", String.format("%.0f",k));
                }
                System.out.println();
            }
            System.out.println();System.out.println();System.out.println();
        }
        System.out.println("Sorted planes: ");


        for(float[][] i:array20) {
            for (float[] j:i) {
                for (float k:j) {
                    System.out.printf("%4s", String.format("%.0f",k));
                }
                System.out.println();
            }
            System.out.println();System.out.println();System.out.println();
        }


    }
}