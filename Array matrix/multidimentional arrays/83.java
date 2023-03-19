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
        float sum = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            sum+=array[i][i];
            if(i!=n-i-1){
                sum+=+array[i][n-i-1];
            }
        }
        System.out.println("Sum of diagonal elements: "+sum);
    }
}