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
        float product = 1;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            product*=array[i][i];
            if(i!=n-i-1){
                product*=+array[i][n-i-1];
            }
        }
        System.out.println("Product of diagonal elements: "+product);
    }
}