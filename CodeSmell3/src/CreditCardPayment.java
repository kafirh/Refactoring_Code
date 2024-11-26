public class CreditCardPayment implements PaymentMethod {
    private static final double FEE_PERCENTAGE = 0.02;

    @Override
    public double calculateFee(double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public void process() {
        System.out.println("Processing credit card payment...");
    }
}