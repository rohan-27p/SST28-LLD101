public class SimpleDriverAllocator implements DriverAllocator {
    public String allocate(TripRequest request) {
        String driver = "DRV-17";
        System.out.println("Driver=" + driver);
        return driver;
    }
}