package Dopravni_prestupky;

public class ProhibitionSing implements TrafficSign {
    private CarAction prohibitedAction;

    public ProhibitionSing(CarAction prohibitedAction) {
        this.prohibitedAction = prohibitedAction;
    }

    @Override
    public boolean isVioleted(Car car) {
        return car.getAction() == prohibitedAction;
    }
}
