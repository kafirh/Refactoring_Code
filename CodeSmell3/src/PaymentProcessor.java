public class PaymentProcessor {
    public double processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.process();
        double fee = paymentMethod.calculateFee(amount);
        return amount + fee;
    }
}