import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void threadSleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void solveTowerOfHanoi(int sizeOfTowerToMove, int fromRod,int toRod,int anotherRod){
        if(sizeOfTowerToMove == 1){
            TowerOfHanoiVisualizer.moveDisc(fromRod,toRod);
            soutTower();
            return;
        }
        solveTowerOfHanoi(sizeOfTowerToMove-1,fromRod,anotherRod,toRod);
        TowerOfHanoiVisualizer.moveDisc(fromRod,toRod);
        soutTower();
        solveTowerOfHanoi(sizeOfTowerToMove-1,anotherRod,toRod,fromRod);
    }

    private static void soutTower() {
        clearScreen();
        TowerOfHanoiVisualizer.soutRods();
        threadSleep(20);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input size of tower. 0 to exit");
            int size = scanner.nextInt();
            if(size<=0){
                break;
            }
            clearScreen();
            TowerOfHanoiVisualizer.fillRods(size);
            TowerOfHanoiVisualizer.soutRods();
            scanner.nextLine();
            while (true) {
                System.out.println("Press Enter to solve");
                scanner.nextLine();
                solveTowerOfHanoi(size, 1, 3, 2);
                System.out.println("Press Enter to reset. e to exit");
                if(scanner.nextLine().equals("e")){
                    break;
                };
                clearScreen();
                TowerOfHanoiVisualizer.fillRods(size);
                TowerOfHanoiVisualizer.soutRods();
            }
        }
    }
}