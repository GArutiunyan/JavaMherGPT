class Shape{
    void draw(){
        System.out.print("Draw ");
    }
}
class Triangle extends Shape{
    @Override
    void draw() {
        super.draw();
        System.out.println("triangle");
    }

    void calculateArea(){
        System.out.println("CalculateArea");
    }

    public void superDraw() {
        super.draw();
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.draw();
        triangle.calculateArea();
        triangle.superDraw();
    }
}