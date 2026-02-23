public class BillingCalculator {

    private final TaxPolicy taxPolicy;
    private final DiscountPolicyResolver resolver;

    public BillingCalculator(TaxPolicy taxPolicy,DiscountPolicyResolver resolver) {
        this.taxPolicy = taxPolicy;
        this.resolver = resolver;
    }

    public Bill compute(String customerType,double subtotal,int distinctLines) {
        double taxPct =taxPolicy.taxPercent(customerType);
        double tax =subtotal * (taxPct / 100.0);

        DiscountPolicy discountPolicy =resolver.resolve(customerType);

        double discount =discountPolicy.discountAmount(customerType,subtotal,distinctLines);

        double total =subtotal + tax - discount;

        return new Bill(subtotal,taxPct,tax,discount,total);
    }
}