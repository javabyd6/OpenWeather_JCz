package pl.sda.weather.model;

import pl.sda.weather.model.Current;
import pl.sda.weather.model.Location;

/**
 * @author Jarek Czaplicki
 */
public class Weather {
    private Location location;
    private Current current;

    public Weather(Location location, Current current) {
        this.location = location;
        this.current = current;
    }

    public Weather() {
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
}
