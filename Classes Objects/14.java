import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
class Phone{
    private String brand, model;
    private int price;

    public Phone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
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

    @Override
    public String toString() {
        return brand+" "+model+" "+ price+"$";
    }
}
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple","iPhone",800);
        System.out.println(phone);
    }
}
