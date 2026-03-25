package Dopravni_prestupky;

public class SpeedLimitSign implements TrafficSign {
    private int maxSpeed;

    public SpeedLimitSign(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean isVioleted(Car car) {
        return car.getSpeed() > maxSpeed;
    }
}
