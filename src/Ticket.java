public class Ticket {
    private Movie movie;
    private int studioNumber;
    private double price;
    private String seat;

    public Ticket(Movie movie, int studioNumber, String seat) {
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.seat = seat;
        this.price = getTicketPrice();
    }

    public String getTicketInfo() {
        return "Movie: " + movie.getTitle() + "\nStudio Number: " + studioNumber + "\nPrice: " + price + "\nSeat: " + seat;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getStudioNumber() {
        return studioNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getSeat() {
        return seat;
    }

    private double getTicketPrice() {
        switch (studioNumber) {
            case 1:
                return 120.0;
            case 2:
                return 100.0;
            case 3: 
                return 50.0;
            default:
                return 0.0; 
        }
    }
}
