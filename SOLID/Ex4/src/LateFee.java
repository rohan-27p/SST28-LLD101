public class LateFee implements FeeComponent {

    public Money monthly() {
        return new Money(2000.0);
    }

    public Money deposit() {
        return new Money(0.0);
    }
}