import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
class House{
    private String address;
    private int price,numberOfRooms;

    public House(String address, int price, int numberOfRooms) {
        this.address = address;
        this.price = price;
        this.numberOfRooms = numberOfRooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return address+" "+numberOfRooms+" rooms "+ price+"$";
    }
}
public class Main {
    public static void main(String[] args) {
        House house = new House("221b, Baker street",200000,8);
        System.out.println(house);
    }
}
