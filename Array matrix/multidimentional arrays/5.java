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
        for(float[] i:array) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
            }
            System.out.println();
        }
        System.out.println("Transposed array: ");
        for(float[] i:array1) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
            }
            System.out.println();
        }
    }
}