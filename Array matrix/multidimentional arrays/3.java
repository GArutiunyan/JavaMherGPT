import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][] array = {{4, 20, 6}, {62, 1, 0}, {6, 5, 77}};
        float sum = 0;

        for(float[] i:array) {
            for (float j:i) {
                sum+=j;
            }
        }
        int n = array.length * array[0].length;
        for(float[] i:array) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
            }
            System.out.println();
        }
        float av = sum/n;
        System.out.print("Average of all elements: ");

        System.out.println(av);
    }
}