public class DefaultPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(Seat seat, Show show) {
        double price = 150;
        if (seat.getType() == SeatType.SILVER) price += 50;
        if (seat.getType() == SeatType.GOLD) price += 100;
        if (seat.getType() == SeatType.PLATINUM) price += 200;

        return price;
    }
}