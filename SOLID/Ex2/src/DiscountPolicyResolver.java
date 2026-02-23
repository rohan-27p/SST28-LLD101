public interface DiscountPolicyResolver {
    DiscountPolicy resolve(String customerType);
}