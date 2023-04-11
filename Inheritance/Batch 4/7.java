abstract class Animal{
    abstract void eat();
}
class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("Cat eats");
    }
}
class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Dog eats");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal;
        animal = new Dog();
        animal.eat();
        animal = new Cat();
        animal.eat();
    }
}