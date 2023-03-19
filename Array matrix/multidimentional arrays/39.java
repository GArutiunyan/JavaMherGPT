import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][] array = {
                new float[]{85, 540, 3, 19},
                new float[]{25, 6, 23, 31, 7, 10},
                new float[]{10, 120, 43, 135, 53}
        };

        float min = array[0][0];
        float max = array[0][0];
        for(float[] i:array) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
                if(j>max){
                    max = j;
                }
                if(j<min){
                    min = j;
                }
            }
            System.out.println();
        }
        System.out.println("Max element: "+max);
        System.out.println("Min element: "+min);
    }
}