public class Discount {
    private static final String DISC10 = "DISC10";
    private static final String DISC20 = "DISC20";

    public double applyDiscount(String discountCode, double totalPrice) {
        if (discountCode.equals(DISC10)) {
            return totalPrice * 0.10; // Diskon 10%
        } else if (discountCode.equals(DISC20)) {
            return totalPrice * 0.20; // Diskon 20%
        } else {
            return 0; // Tidak ada diskon
        }
    }
}