package GvvProject.Models;

import GvvProject.Interface.TrainCar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Сам поезд
public class PassengerTrain {
    public final List<TrainCar> cars;
    private final Locomotive locomotive;

    public PassengerTrain() {
        this.cars = new ArrayList<>();
        this.locomotive = new Locomotive();
    }

    public void addCar(TrainCar car) {
        cars.add(car);
    }

    public int getTotalPassengerCount() {
        int total = 0;
        for (TrainCar car : cars) {
            total += car.getPassengerCount();
        }
        return total;
    }

    public int getTotalLuggageCount() {
        int total = 0;

        for (TrainCar car : cars) {
            total += car.getLuggageCount();
        }

        return total;
    }

    public void sortCarsByComfort() {
        cars.sort(Comparator.comparingInt(TrainCar::getSortKey));
    }

    public List<TrainCar> findCarsByPassengerRange(int minPassengerCount, int maxPassengerCount) {
        List<TrainCar> foundCars = new ArrayList<>();
        for (TrainCar car : cars) {
            if (car.getPassengerCount() >= minPassengerCount && car.getPassengerCount() <= maxPassengerCount) {
                foundCars.add(car);
            }
        }
        return foundCars;
    }

    public void printTrainInfo() {
        System.out.println("Состав поезда:");
        System.out.print("1)");
        System.out.print(locomotive);
        System.out.println();

        for (int i = 0; i < cars.toArray().length; i++) {
            TrainCar car = cars.get(i);

            System.out.print(i + 2 + ")");
            System.out.print(car);
            System.out.println();
        }

        System.out.println("Общая численность пассажиров: " + getTotalPassengerCount());
        System.out.println("Общая численность багажа: " + getTotalLuggageCount());
    }
}