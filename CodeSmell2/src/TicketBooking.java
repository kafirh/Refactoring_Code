import model.Ticket;

public class TicketBooking {
    
    public void bookTicket(Ticket ticket) {
                            
        // Simulasi pemrosesan pemesanan tiket
        System.out.println("Memproses pemesanan tiket...");
        ticket.printDetailTicket();
        System.out.println("Pesanan selesai.");
    }
}
