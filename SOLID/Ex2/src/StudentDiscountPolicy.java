public class StudentDiscountPolicy
        implements DiscountPolicy {

    @Override
    public double discountAmount(
            String customerType,
            double subtotal,
            int distinctLines) {

        if (subtotal >= 180.0)
            return 10.0;

        return 0.0;
    }
}