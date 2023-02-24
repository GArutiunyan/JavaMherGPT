import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

class MusicAlbum{
    private String title,artist;
    private Date releaseDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public MusicAlbum(String title, String artist, Date releaseDate) {
        this.title = title;
        this.artist = artist;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return title+" "+artist+" "+releaseDate;
    }
}
public class Main {
    public static void main(String[] args) {
        MusicAlbum musicAlbum = new MusicAlbum("Album","Musician",new GregorianCalendar(1997,12,19).getTime());
        System.out.println(musicAlbum);
    }
}