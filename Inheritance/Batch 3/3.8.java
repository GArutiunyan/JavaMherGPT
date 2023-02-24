class Animal{
    public void eat(){
        System.out.println("eat");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.print("Cat ");
        super.eat();
    }

    public void superEat(){
        super.eat();
    }
    public void purr(){
        System.out.println("Purr");
    }
}
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.purr();
        cat.superEat();
    }
}