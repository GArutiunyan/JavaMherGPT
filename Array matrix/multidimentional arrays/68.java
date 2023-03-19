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
        float element;
        Boolean found = false;
        int x = -1;
        int y = -1;
        while(!found) {
            System.out.print("Enter element you want to replace: ");
            element = scanner.nextFloat();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == element) {
                        System.out.println("Row: " + (i + 1));
                        System.out.println("Column: " + (j + 1));
                        x = i;
                        y = j;
                        found = true;
                    }
                    if (found) {
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println("Element not found");
            }
        }
        System.out.print("Enter new element: ");
        array[x][y] = scanner.nextFloat();
        System.out.println("New array:");
        for(float[] i:array) {
            for (float j:i) {
                System.out.printf("%4s", String.format("%.0f",j));
            }
            System.out.println();
        }

    }
}