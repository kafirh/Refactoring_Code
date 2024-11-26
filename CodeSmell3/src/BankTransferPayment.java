public class BankTransferPayment implements PaymentMethod {
    private static final double FEE_PERCENTAGE = 0.01;

    @Override
    public double calculateFee(double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public void process() {
        System.out.println("Processing bank transfer...");
    }
}