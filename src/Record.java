import java.io.Serializable;

public class Record implements Serializable {

    private String artist;
    private String title;
    private String imgURL;
    private int price;

    public Record(String artist, String title, String imgURL, int price) {
        this.artist = artist;
        this.title = title;
        this.imgURL = imgURL;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
