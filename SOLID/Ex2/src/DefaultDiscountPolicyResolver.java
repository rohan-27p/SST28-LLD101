public class DefaultDiscountPolicyResolver
        implements DiscountPolicyResolver {

    private final DiscountPolicy student =
            new StudentDiscountPolicy();

    private final DiscountPolicy staff =
            new StaffDiscountPolicy();

    @Override
    public DiscountPolicy resolve(
            String customerType) {

        if ("student".equalsIgnoreCase(customerType))
            return student;

        if ("staff".equalsIgnoreCase(customerType))
            return staff;

        return (c,s,l) -> 0.0;
    }
}