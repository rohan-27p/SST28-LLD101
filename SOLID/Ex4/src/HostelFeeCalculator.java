import java.util.*;

public class HostelFeeCalculator {

    private final RoomPricingResolver roomResolver =
            new RoomPricingResolver();

    private final AddOnResolver addOnResolver =
            new AddOnResolver();

    public FeeBreakup calculate(BookingRequest r) {

        List<FeeComponent> comps =
                new ArrayList<>();

        comps.add(
            roomResolver.resolve(r.roomType));

        comps.addAll(
            addOnResolver.resolve(r.addOns));

        Money monthly = new Money(0.0);
        Money deposit = new Money(0.0);

        for (FeeComponent c : comps) {

            monthly = monthly.plus(c.monthly());
            deposit = deposit.plus(c.deposit());
        }

        return new FeeBreakup(
                monthly,
                deposit);
    }
}