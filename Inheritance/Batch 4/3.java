class Flower{
    void bloom(){
        System.out.println("blooming");
    }

    protected void grow() {
        System.out.println("growing");
    }
}
class Rose extends Flower{
    @Override
    void bloom() {
        System.out.print("rose is ");
        super.bloom();
    }
    public void grow(){
        System.out.print("rose is ");
        super.grow();
    }
}
class RedRose extends Rose{
    @Override
    public void grow() {
        System.out.print("Red ");
        super.grow();
    }
}
public class Main {
    public static void main(String[] args) {
        Rose r = new Rose();
        RedRose rr = new RedRose();
        r.bloom();
        rr.grow();
    }
}