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
            for(int j = 0; j< array[0].length;j++){
                for (int k = 0; k < array[0][0].length;k++){
                    array2[j][k][i]=array[i][j][k];
                }
            }
        }

        System.out.println("Array:");
        for(float[][] i:array) {
            for (float[] j:i) {
                for (float k:j) {
                    System.out.printf("%4s", String.format("%.0f",k));
                }
                System.out.println();
            }
            System.out.println();
        }



        float sum = 0;

        int soutcount = 0;
        System.out.println("Sums of rows: ");
        for(float[][] i:array) {
            for (float[] j:i) {
                sum = 0;
                for (float k:j) {
                    sum+=k;
                }
                if(soutcount%3==0){
                    System.out.println();
                }
                System.out.println(sum);
                soutcount++;
            }
        }
        soutcount=0;
        System.out.println();
        System.out.println("Sums of cols: ");
        for(float[][] i:array1) {
            for (float[] j:i) {
                sum = 0;
                for (float k:j) {
                    sum+=k;
                }
                if(soutcount%3==0){
                    System.out.println();
                    System.out.println();
                }
                System.out.print(sum+"      ");
                soutcount++;
            }
        }
        System.out.println();
        soutcount=0;
        System.out.println();
        System.out.println("Sums of planes: ");
        for(float[][] i:array2) {
            for (float[] j:i) {
                sum = 0;
                for (float k:j) {
                    sum+=k;
                }
                if(soutcount%3==0){
                    System.out.println();
                }
                System.out.print(sum+"   ");
                soutcount++;
            }
        }

        System.out.println();
    }
}