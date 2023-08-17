package Models;

import java.util.ArrayList;
import java.util.List;

public class Activity {
    private String name;
    private String description;
    private Double cost;
    private Integer capacity;

    private List<Passenger> members;

    public Activity(String name, String description, Double cost, Integer capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getCost() {
        return cost;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public List<Passenger> getMembers() {
        return members;
    }

    public boolean signUp(Passenger passenger) {
        if (members.size() < capacity) {
            if (passenger.calculate(getCost())) {
                members.add(passenger);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Activity [name=" + name + ", description=" + description + ", cost=" + cost + ", capacity=" + capacity
                + ", members=" + members + "]";
    }

}
