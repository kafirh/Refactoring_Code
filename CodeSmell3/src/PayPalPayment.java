public class PayPalPayment implements PaymentMethod {
    private static final double FEE_PERCENTAGE = 0.03;

    @Override
    public double calculateFee(double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public void process() {
        System.out.println("Processing PayPal payment...");
    }
}
