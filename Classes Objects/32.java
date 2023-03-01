import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
class Television{
    private String brand;
    private int price,size;

    public Television(String brand, int price, int size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return brand+" "+size+"\" "+price+"$";
    }
}
public class Main {
    public static void main(String[] args) {
        Television television = new Television("Samsung",2000,32);
        System.out.println(television);
    }
}
