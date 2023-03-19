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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element you want to find: ");
        float x = scanner.nextFloat();
        Boolean found = false;
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j]==x){
                    System.out.println("Row: "+(i+1));
                    System.out.println("Column: "+(j+1));
                    found = true;
                }
                if(found){
                    break;
                }
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}