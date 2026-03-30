public class FloorPanel {
    int floor;

    public void pressUp() {
        ElevatorSystem.getInstance().requestElevator(floor, Direction.UP);
    }

    public void pressDown() {
        ElevatorSystem.getInstance().requestElevator(floor, Direction.DOWN);
    }
}