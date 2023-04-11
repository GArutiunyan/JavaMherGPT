import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoiVisualizer {

    static int n = 0;
    static String format;
    static int widthOfMaxDisc;

    static ArrayList<ArrayList<Integer>> rods = new ArrayList<ArrayList<Integer>>();
    public static void fillRods(int howMuchDiscs){
        n = howMuchDiscs;
        widthOfMaxDisc = calculateWidth(n);
        format = "%"+(widthOfMaxDisc+2)+"s";
        if(rods.size()==3) {
            rods.remove(0);
            rods.remove(0);
            rods.remove(0);
        }
        ArrayList<Integer> rod1 = new ArrayList<>();
        for (int i = howMuchDiscs; i >0; i--){
            rod1.add(i);
        }
        rods.add(rod1);
        rods.add(new ArrayList<Integer>());
        rods.add(new ArrayList<Integer>());
    }

    private static int calculateWidth(int n) {
        if(n==0){
            return 0;
        }
        return n*2-1;
    }

    public static void moveDisc(int from, int to){
        from--;
        to--;
        ArrayList<Integer> rod1 = rods.get(from);
        int indexOfDisc = rod1.size()-1;
        int discSize = rod1.get(indexOfDisc);
        rod1.remove(indexOfDisc);
        rods.get(to).add(discSize);
    }

    public static void soutRods(){
        System.out.println();
        int height = 0;
        for(int i = 0; i <3; i++){
            int rodheight = rods.get(i).size();
            if(rodheight>height){
                height = rodheight;
            }
        }
        for (int i = height; i<n; i++){
            System.out.println();
        }
        for(int i = height; i>0;i--){
            ArrayList<Integer> rod;
            for(int j = 0; j <3; j++){
                rod = rods.get(j);
                int discSize = 0;
                if(rod.size()>=i){
                    discSize = rod.get(i-1);
                }
                drawLayer(discSize);
            }
            System.out.println();
        }
    }

    private static void drawLayer(int discSize) {
        StringBuilder layer = new StringBuilder();
        int width = calculateWidth(discSize);

        layer.append("@".repeat(width));
        layer.append(" ".repeat((widthOfMaxDisc+2-width)/2));
        System.out.format(format, layer);
    }
}