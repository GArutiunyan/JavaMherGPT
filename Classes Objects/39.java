import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

class Movie{
    private String title,director;
    private Date releaseDate;

    public Movie(String title, String director, Date releaseDate) {
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return title+" "+director+" "+releaseDate;
    }
}
public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Titanic","James Cameron",new GregorianCalendar(1997,12,19).getTime());
        System.out.println(movie);
    }
}