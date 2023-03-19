import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[][] array = {{4, 20, 6}, {62, 1, 0}, {6, 5, 77}};
        for(float[] i:array) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
            }
            System.out.println();
        }
        float product = 0;
        for (int i = 1; i < array.length; i++) {
            for(int j = 1; j < array[i].length; j++){
                product*=array[i][j];
            }
        }
        System.out.println("Product of all elements exept row 0 and column 0: "+product);
    }
}