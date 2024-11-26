public class OrderRepository {
    public void saveOrder(OrderModel order) {
        System.out.println("Pesanan disimpan ke database: " + order.getOrderId());
    }
}