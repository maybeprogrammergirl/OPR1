package Dopravni_prestupky;

import java.util.ArrayList;
import java.util.List;

public class FineManager {
    public List<Fine> checkViolations(Car car, Location location) {
        List<Fine> violations = new ArrayList<>();

        for (TrafficSign sign : location.getTrafficSigns()) {
            if (sign.isViolated(car)) {
                Fine newFine = new Fine("Přestupek v lokaci " + location.toString(), 1000.0);
                violations.add(newFine);
                car.addTicket(newFine); // Přidání pokuty přímo autu
            }
        }
        return violations;
    }
}
