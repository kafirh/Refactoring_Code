import model.Ticket;

public class TicketCanceling {
    public void cancelTicket(Ticket ticket) {
        // Simulasi pembatalan pemesanan tiket
        System.out.println("Memproses pembatalan tiket...");
        ticket.printDetailTicket();
        System.out.println("Pesanan dibatalkan.");
    }
}
