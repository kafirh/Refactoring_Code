public class NotificationService {
    public void sendNotification(OrderModel order, double finalPrice) {
        String message = "Pesanan Anda telah diproses dengan total: " + finalPrice;
        String phoneNumber = order.getCustomerPhone();
        System.out.println("Mengirim pesan ke " + phoneNumber + ": " + message);
    }
}