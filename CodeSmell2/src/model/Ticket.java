package model;

public class Ticket {
    private Movie movie;
    private Customer customer;
    private String seatNumber;
    public Ticket(Movie movie, Customer customer, String seatNumber) {
        this.movie = movie;
        this.customer = customer;
        this.seatNumber = seatNumber;
    }
    public Movie getMovie() {
        return movie;
    }
    public Customer getCustomer() {
        return customer;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void printDetailTicket(){
        customer.printCustomer();
        movie.printMovie();
        System.out.println("Kursi: " + seatNumber);
    }

    public void printDetailTicket(Movie newMovie){
        customer.printCustomer();
        movie.printMovie(newMovie);
        System.out.println("Kursi: " + seatNumber);
    }
}
