package GvvProject.Models;

import GvvProject.Abstract.RailwayVehicle;

// Прицеп багаж
public class LuggageCar extends RailwayVehicle {
    public LuggageCar(int capacity) {
        super(capacity);
    }

    @Override
    public int getComfortLevel() {
        return 0;
    }

    @Override
    public String getType() {
        return "Багажный вагон";
    }

    @Override
    public String toString() {
        return "Багажный вагон: вместимость=" + this.getCapacity() + ", багажа=" + this.getLuggageCount();
    }
}