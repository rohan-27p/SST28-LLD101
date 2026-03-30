public class CarPanel {
    ElevatorCar car;

    public void selectFloor(int floor) {
        car.addInternalRequest(floor);
    }

    public void pressAlarm() {
        System.out.println("Emergency triggered!");
    }
}