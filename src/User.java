public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private Ticket[] ticketLists;
    private static int MaxTicket;
    private int ticketCount;

    public User(String email2, String email, String password, double balance, String fullName) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = balance;
        this.ticketCount = 0;
    }

    public User(String email2, String password2, String fullName2, double balance2, int i) {
        //TODO Auto-generated constructor stub
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean addTicket(Ticket ticket) {
        if (ticketCount < MaxTicket) {
            ticketLists[ticketCount++] = ticket;
            return true;
        }
        return false;
    }

    public void displayAllTicket() {
        System.out.println("Tickets untuk pengguna : " + fullName);
        for (Ticket ticket : ticketLists) {
            if (ticket != null) {
                System.out.println(ticket.toString());
            }
        }
    }

    public boolean isMatch(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

}
