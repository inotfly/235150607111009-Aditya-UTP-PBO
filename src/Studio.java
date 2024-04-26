public class Studio {
    private Movie movie;
    private String type;
    private boolean[][] seats;

    public Studio(String type) {
        this.type = type;
        this.seats = new boolean[10][10];
        setSeats();
    }

    public String getStudioInfo() {
        return "Studio Type: " + type + "\nNumber of Rows: " + seats.length + "\nNumber of Columns: " + seats[0].length;
    }

    public boolean isBooked(char row, int col) {
        int rowIndex = row - 'A';
        return seats[rowIndex][col - 1];
    }

    public boolean reserve(char row, int col) {
        int rowIndex = row - 'A';
        if (rowIndex >= 0 && rowIndex < seats.length && col > 0 && col <= seats[0].length) {
            if (!seats[rowIndex][col - 1]) {
                seats[rowIndex][col - 1] = true;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String getType() {
        return type;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setSeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = false;
            }
        }
    }

    public boolean bookTicket(User user, char row, int col) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bookTicket'");
    }
}