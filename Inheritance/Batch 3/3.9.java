class Vehicle{
    public void drive(){
        System.out.println("drive");
    }
}
class Motorcycle extends Vehicle{
    @Override
    public void drive() {
        System.out.print("Moto ");
        super.drive();
    }

    public void superDrive(){
        super.drive();
    }
    public void revEngine(){
        System.out.println("revEngine");
    }
}
public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.drive();
        motorcycle.revEngine();
        motorcycle.superDrive();
    }
}