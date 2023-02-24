import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

class Book{
    private String title;
    private String author;

    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        setISBN(ISBN);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {

        if (checkISBN(ISBN)) {
            this.ISBN = ISBN;
        }else {
            this.ISBN = "Wrong ISBN format";
        }
    }
    private boolean checkISBN(String code){
        String[] s = code.split("");
        String lib = "0123456789-";
        int count = 0;
        if(s.length != 17){
            return false;
        }
        for (int i =0; i < 17;i++){
            if(!lib.contains(s[i])){
                return false;
            }
        }
        return true;
    }



}
public class Main {
    public static void main(String[] args) {

        Book book = new Book("Book1","Gena","123123-1231-123-1231");
        Book book2 = new Book("Book2","Aaa", "978-5-699-12014-7");
        System.out.println("    Book1:");
        System.out.println("Title: "+book.getTitle());
        System.out.println("Author: "+book.getAuthor());
        System.out.println("ISBN: "+book.getISBN());
        System.out.println("    Book2:");
        System.out.println("Title: "+book2.getTitle());
        System.out.println("Author: "+book2.getAuthor());
        System.out.println("ISBN: "+book2.getISBN());
    }
}
