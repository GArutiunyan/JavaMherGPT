import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][] array = {
                new float[]{85, 540, 3, 19},
                new float[]{25, 6, 23, 31, 7, 10},
                new float[]{10, 120, 43, 135, 53}
        };
        for(float[] i:array) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
            }
            System.out.println();
        }
        System.out.println("Row sums: ");
        float[] rowsums = new float[array.length];
        int maxs = array[0].length;
        int ind = 0;
        for(float[] i:array) {
            if(i.length>maxs){
                maxs = i.length;
            }
            float rowsum = 0;
            for (float j:i) {
                rowsum+=j;
            }
            rowsums[ind]=rowsum;
            ind++;
            System.out.println(rowsum);
        }
        System.out.println();
        System.out.println("Col sums:");
        float[] colsums = new float[maxs];
        for(int j = 0; j < maxs;j++){
            float colsum = 0;
            for(int i = 0;i < array.length; i++){

                if(array[i].length-1>=j){
                    colsum+=array[i][j];
                }
            }
            colsums[j]=colsum;
            System.out.println(colsum);
        }




    }
}