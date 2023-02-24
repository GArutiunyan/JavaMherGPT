import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

class RecktangulrPrizm{
    public int length,width,height;

    public RecktangulrPrizm(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class Main {
    public static void main(String[] args) {
        RecktangulrPrizm recktangulrPrizm = new RecktangulrPrizm(1,2,3);
        System.out.println("length "+recktangulrPrizm.getLength());
        System.out.println("width "+recktangulrPrizm.getWidth());
        System.out.println("height "+recktangulrPrizm.getHeight());
        System.out.print("volume: ");
        System.out.println(recktangulrPrizm.height* recktangulrPrizm.length* recktangulrPrizm.width);
    }
}
