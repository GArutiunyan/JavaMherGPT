import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

class Product{
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void printNamePriceQuantity() {
        System.out.println("NAme: "+getName());
        System.out.println("Price: "+getPrice());
        System.out.println("Quantity: "+getQuantity());
    }
}
public class Main {
    public static void main(String[] args) {
        Product p = new Product("Milk",70,1);
        p.printNamePriceQuantity();
    }

}
