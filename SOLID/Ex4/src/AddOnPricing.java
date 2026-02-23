public interface AddOnPricing extends FeeComponent {

    default Money deposit() {
        return new Money(0.0);
    }
}