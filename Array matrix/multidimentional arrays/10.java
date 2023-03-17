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
        float largestrowsum = rowsum[0];
        for (float i:rowsum) {
            if(i > largestrowsum){
                largestrowsum = i;
            }
        }
        float largestcolsum = colsum[0];
        for (float i:colsum) {
            if (i> largestcolsum){
                largestcolsum = i;
            }
        }
        System.out.println("Largest sum of elements in a row: "+largestrowsum);
        System.out.println("Largest sum of elements in a column: "+largestcolsum);
    }
}