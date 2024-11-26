import model.Movie;
import model.Ticket;

public class TicketRescheduling {
    public void rescheduleTicket(Ticket ticket, Movie newMovie) {
        // Simulasi penggantian jadwal tiket
        System.out.println("Memproses penggantian jadwal tiket...");
        ticket.printDetailTicket(newMovie);
        System.out.println("Jadwal berhasil diganti.");
    }
}
