public class TransportBookingService {

    private DistanceCalculator distanceCalculator;
    private DriverAllocator driverAllocator;
    private PaymentGateway paymentGateway;

    public TransportBookingService(
        DistanceCalculator distanceCalculator,
        DriverAllocator driverAllocator,
        PaymentGateway paymentGateway
    ) {
        this.distanceCalculator = distanceCalculator;
        this.driverAllocator = driverAllocator;
        this.paymentGateway = paymentGateway;
    }

    public void book(TripRequest request) {
        System.out.println("=== Transport Booking ===");

        double distance = distanceCalculator.calculate(request);

        String driver = driverAllocator.allocate(request);

        double fare = distance * 15;

        String txn = paymentGateway.pay(fare);

        System.out.println("RECEIPT: R-501 | fare=" + String.format("%.2f", fare));
    }
}