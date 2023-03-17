import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][] array = {{4, 20, 6}, {62, 1, 0}, {6, 5, 77}};
        float[] rowsum = new float[array[0].length];
        float[] colsum = new float[array.length];
        float sum = 0;

        for(float[] i:array) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
            }
            System.out.println();
        }
        int ind = 0;
        for(float[] i:array) {
            sum = 0;
            for (float j:i) {
                sum+=j;
            }
            rowsum[ind]=sum;
            ind++;
        }
        ind = 0;
        System.out.println();
        for(int j = 0; j < array.length; j++){
            sum = 0;
            for (float[] i:array) {
                sum+=i[j];
            }
            colsum[ind]=sum;
            ind++;
        }
        System.out.println("Sum in each row:");
        for (float i:rowsum) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sum in each column:");
        for (float i:colsum) {
            System.out.print(i+" ");
        }
    }
}