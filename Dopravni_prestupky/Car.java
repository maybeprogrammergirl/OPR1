package Dopravni_prestupky;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private int currentSpeed;
    private String SPZ;
    private CarAction currentAction;
    private Direction currentDirection;
    private List<Fine> tickets = new ArrayList<>();

    public Car(String SPZ, int currentSpeed, CarAction currentAction, Direction currentDirection) {
        this.SPZ = SPZ;
        this.currentSpeed = currentSpeed;
        this.currentAction = currentAction;
        this.currentDirection = currentDirection;
    }

    public CarAction getAction() {
        return currentAction;
    }

    public int getSpeed() {
        return currentSpeed;
    }

    public Direction getDirection() {
        return currentDirection;
    }

    public void addTicket(Fine fine) {
        tickets.add(fine);
    }
}
