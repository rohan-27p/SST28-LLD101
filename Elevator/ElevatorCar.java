import java.util.PriorityQueue;

public class ElevatorCar {
    int id;
    int currentFloor;
    ElevatorState state;
    double currentWeight;
    double maxWeight;

    PriorityQueue<Integer> upQueue;
    PriorityQueue<Integer> downQueue;

    Door door;
    Motor motor;

    public void addExternalRequest(int floor, Direction dir) { }
    public void addInternalRequest(int floor) { }

    public void move() { }
}