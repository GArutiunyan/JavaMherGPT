class Shape{
    void rotate(){
        System.out.println("Rotate");
    }
}
class Square extends Shape{
    @Override
    void rotate() {
        System.out.print("Square ");
        super.rotate();
    }
    void superRotate(){
        super.rotate();
    }

    void calculatePerimetr(){
        System.out.println("Calculate perimetr");
    }
}
public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.rotate();
        square.calculatePerimetr();
        square.superRotate();
    }
}