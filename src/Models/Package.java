package Models;

import java.util.List;

public class Package {
    private String name;
    private Integer maxPassengerCapacity;
    private List<Destination> itenary;
    private List<Passenger> passengers;

    public Package(String name, Integer capacity, List<Destination> destinations, List<Passenger> passengers) {
        this.name = name;
        this.maxPassengerCapacity = capacity;
        this.itenary = destinations;
        this.passengers = passengers;
    }

    public String getName() {
        return name;
    }

    public List<Destination> getItenary() {
        return itenary;
    }

    public Integer getMaxPassengerCapacity() {
        return maxPassengerCapacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return "Package [name=" + name + ", maxPassengerCapacity=" + maxPassengerCapacity + ", itenary=" + itenary
                + ", passengers=" + passengers + "]";
    }

}
