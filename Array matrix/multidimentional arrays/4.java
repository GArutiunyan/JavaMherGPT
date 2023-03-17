import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][] array = {{4, 20, 6}, {62, 1, 0}, {6, 5, 77}};
        float min = array[0][0];
        float max = array[0][0];
        for(float[] i:array) {
            for (float j:i) {
                if(j>max){
                    max=j;
                }
                if(j<min){
                    min = j;
                }
            }
        }
        int n = array.length * array[0].length;
        for(float[] i:array) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
            }
            System.out.println();
        }
        System.out.print("Maximum element: ");
        System.out.println(max);
        System.out.print("Minimum element: ");
        System.out.println(min);
    }
}