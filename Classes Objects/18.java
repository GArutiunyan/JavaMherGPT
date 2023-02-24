
class Bicycle{
    private String brand,model;
    private int price;

    public Bicycle(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return brand+" "+model + " "+price+"$";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("adfdf","adfsdf",200);
        System.out.println(bicycle);
    }
}
