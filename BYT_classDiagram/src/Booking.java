import java.util.Date;

public class Booking {
    private Date bookingDate;
    private Match match;
    private Restaurant restaurant;

    public Booking(Date bookingDate, Match match, Restaurant restaurant) {
        this.bookingDate = bookingDate;
        this.match = match;
        this.restaurant = restaurant;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}



