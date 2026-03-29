public class SimpleDistanceCalculator implements DistanceCalculator {
    public double calculate(TripRequest request) {
        double distance = 6.0; //same logic
        System.out.println("DistanceKm=" + distance);
        return distance;
    }
}