import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][] array = {{4, 20, 6}, {62, 100, 0}, {6, 5, 77}};
        float[] rowsums = new float[array.length];
        for(int i = 0; i < array.length; i++) {
            float sum = 0;
            for (float j:array[i]) {
                System.out.printf("%4s", String.format("%.0f",j));
                sum+=j;
            }
            System.out.println();
            rowsums[i]=sum;
        }
        System.out.println();


        for(int i = 0; i < rowsums.length-1; i++){
            for(int j = 0; j <= i; j++){
                if(rowsums[j] > rowsums[j+1]){
                    float x = rowsums[j];
                    rowsums[j] = rowsums[j+1];
                    rowsums[j+1]=x;
                    float[] xx = array[j];
                    array[j] = array[j+1];
                    array[j+1] = xx;
                }
            }
        }
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                System.out.printf("%4s", String.format("%.0f",array[i][j]));
            }
            System.out.println("  sum = "+rowsums[i]);
        }
    }
}