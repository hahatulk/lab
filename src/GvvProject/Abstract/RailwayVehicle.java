package GvvProject.Abstract;

import GvvProject.Interface.Sortable;
import GvvProject.Interface.TrainCar;

public abstract class RailwayVehicle implements TrainCar, Sortable {
    protected int passengerCount;
    protected int luggageCount;
    protected int capacity;

    public RailwayVehicle(int capacity) {
        this.passengerCount = 0;
        this.luggageCount = 0;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public int getPassengerCount() {
        return this.passengerCount;
    }

    @Override
    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    @Override
    public int getLuggageCount() {
        return this.luggageCount;
    }

    @Override
    public void setLuggageCount(int luggageCount) {
        this.luggageCount = luggageCount;
    }

    @Override
    public int getSortKey() {
        return this.getComfortLevel();
    }
}