class Vehicle{
    void start(){
        System.out.println("Starts");
    }
}
class Car extends  Vehicle{
    @Override
    void start() {
        System.out.print("Car ");
        super.start();
    }
    void superStart(){
        super.start();
    }

    void honk(){
        System.out.println("Honks");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.honk();
        car.superStart();
    }
}