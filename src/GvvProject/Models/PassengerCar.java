package GvvProject.Models;

import GvvProject.Abstract.RailwayVehicle;

// Прицеп пассаэирский
public class PassengerCar extends RailwayVehicle {
    private final int comfortLevel;

    public PassengerCar(int capacity, int comfortLevel) {
        super(capacity);
        this.comfortLevel = comfortLevel;
    }

    @Override
    public int getComfortLevel() {
        return this.comfortLevel;
    }

    @Override
    public String getType() {
        return "Пассажирский вагон";
    }

    @Override
    public String toString() {
        return "Пассажирский вагон: вместимость=" + this.getCapacity() + ", пассажиров=" + this.getPassengerCount() + ", багажа=" + this.getLuggageCount() + ", уровень комфорта=" + this.comfortLevel;
    }
}