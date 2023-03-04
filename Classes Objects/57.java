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

    public void comparePrice(Product p1) {
        int price1 = p1.getPrice();
        if(price==price1){
            System.out.println("Prices are equal");
        } else {
            if(price>price1){
                System.out.println(name+" is more expensive");
            }else{
                System.out.println(p1.getPrice()+" is more expensive");
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Product p = new Product("Milk",70,1);
        Product p1 = new Product("Bread",40,1);
        p.printNamePriceQuantity();
        System.out.println();
        p1.printNamePriceQuantity();
        System.out.println();
        p.comparePrice(p1);
    }

}
