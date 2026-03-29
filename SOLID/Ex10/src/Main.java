public class Main {
    public static void main(String[] args) {
        GeoPoint from = new GeoPoint(0.123457, 1.234567);
        GeoPoint to = new GeoPoint(3.23456, 1.2345678);

        TripRequest request = new TripRequest("23BCS1007",from,to);

        DistanceCalculator dc = new SimpleDistanceCalculator();
        DriverAllocator da = new SimpleDriverAllocator();
        PaymentGateway pg = new SimplePaymentGateway();

        TransportBookingService service =
            new TransportBookingService(dc, da, pg);

        service.book(request);
    }
}