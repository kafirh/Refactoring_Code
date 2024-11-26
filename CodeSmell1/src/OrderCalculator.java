public class OrderCalculator {
    private final Discount discount;

    public OrderCalculator(Discount discount){
        this.discount = discount;
    }
    
    public double calculateFinalPrice(OrderModel order) {
        double finalPrice = order.getTotalPrice() + order.getTax();
        if (order.getDiscountCode() != null && !order.getDiscountCode().isEmpty()) {
            finalPrice -= discount.applyDiscount(order.getDiscountCode(), order.getTotalPrice());
        }
        return finalPrice;
    }
}