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
}
public class Main {
    public static void main(String[] args) {
        Product product = new Product("Milk",70,2);
        System.out.println("NAme: "+product.getName());
        System.out.println("Price: "+product.getPrice());
        System.out.println("Quantity: "+product.getQuantity());
        System.out.println("Total cost: "+product.getPrice()*product.getQuantity());
    }

}
