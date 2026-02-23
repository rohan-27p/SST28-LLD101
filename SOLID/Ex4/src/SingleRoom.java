public class SingleRoom implements RoomPricing {

    public Money monthly() {
        return new Money(10000.0);
    }

    public Money deposit() {
        return new Money(3000.0);
    }
}