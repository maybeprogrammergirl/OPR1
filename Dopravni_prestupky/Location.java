package Dopravni_prestupky;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    private List<Car> cars = new ArrayList<>();
    private List<TrafficSign> trafficSigns = new ArrayList<>();

    public Location(String name) {
        this.name = name;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addTrafficSign(TrafficSign trafficSign) {
        trafficSigns.add(trafficSign);
    }

    public List<TrafficSign> getTrafficSigns() {
        return trafficSigns;
    }
}
