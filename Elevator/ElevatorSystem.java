class ElevatorSystem {
    private static ElevatorSystem instance;
    private List<ElevatorCar> elevators;
    private SchedulingStrategy strategy;

    private ElevatorSystem() {}

    public static ElevatorSystem getInstance() {
        if (instance == null) instance = new ElevatorSystem();
        return instance;
    }

    public void requestElevator(int floor, Direction dir) {
        ElevatorCar car = strategy.selectElevator(elevators, floor, dir);
        car.addExternalRequest(floor, dir);
    }
}   