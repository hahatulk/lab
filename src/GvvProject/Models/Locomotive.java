package GvvProject.Models;

import GvvProject.Abstract.RailwayVehicle;

// Тягач
class Locomotive extends RailwayVehicle {
    public Locomotive() {
        super(0);
    }

    @Override
    public int getComfortLevel() {
        return 0;
    }

    @Override
    public String getType() {
        return "Локомотив";
    }

    @Override
    public String toString() {
        return "Локомотив";
    }
}