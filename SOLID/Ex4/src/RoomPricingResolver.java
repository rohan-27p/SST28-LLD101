public class RoomPricingResolver {

    public RoomPricing resolve(int type) {

        if (type == LegacyRoomTypes.SINGLE) return new SingleRoom();
        if (type == LegacyRoomTypes.DOUBLE) return new DoubleRoom();

        throw new RuntimeException("Unknown room type");
    }
}