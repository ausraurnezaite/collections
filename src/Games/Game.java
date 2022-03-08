package Games;

public class Game {


    private String title;
    private genre genre;
    private Double price;
    private Integer copiesSold;

    public Game(String title, Games.genre genre, Double price, Integer copiesSold) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.copiesSold = copiesSold;
    }

    public void incrementPrice(double amount) {
        this.price += amount;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                ", copiesSold=" + copiesSold +
                '}';
    }

    public Double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public Games.genre getGenre() {
        return genre;
    }


    public Integer getCopiesSold() {
        return copiesSold;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(Games.genre genre) {
        this.genre = genre;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCopiesSold(Integer copiesSold) {
        this.copiesSold = copiesSold;
    }
}
/*
Create a class Game with private modifies with public getter setters with these fields :
    String title
    Enum genre
    Double price
    Integer copiesSold
 */
