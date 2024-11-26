public class OrderProcessor {

    private final OrderCalculator orderCalculator;
    private final OrderRepository orderRepository;
    private final NotificationService notificationService;

    public OrderProcessor(OrderCalculator orderCalculator, OrderRepository orderRepository, NotificationService notificationService){
        this.orderCalculator = orderCalculator;
        this.orderRepository = orderRepository;
        this.notificationService = notificationService;
    }
    
    public void processOrder(OrderModel order) {
        final String INVALID_ORDER_MESSAGE = "Pesanan tidak valid";

        if (order.isValidOrder()) {
            System.out.println(INVALID_ORDER_MESSAGE);
            return;
        }
        
        double finalPrice = orderCalculator.calculateFinalPrice(order);

        orderRepository.saveOrder(order);

        notificationService.sendNotification(order, finalPrice);
    }
}
