class Animal{

    void move(){
        System.out.println("Moves");
    }

}
class Dog extends Animal{
    @Override
    void move() {
        System.out.print("Dog ");
        super.move();
    }

    void superMove(){
        super.move();
    }


    void bark(){
        System.out.println("Barks");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move();
        dog.superMove();
    }
}