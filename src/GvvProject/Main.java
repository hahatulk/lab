package GvvProject;

import GvvProject.Interface.TrainCar;
import GvvProject.Models.LuggageCar;
import GvvProject.Models.PassengerCar;
import GvvProject.Models.PassengerTrain;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PassengerTrain train = new PassengerTrain();

        // Создание вагонов
        train.addCar(new PassengerCar(100, 3));
        train.addCar(new PassengerCar(80, 2));
        train.addCar(new LuggageCar(50));
        train.addCar(new PassengerCar(60, 1));

        // Заполнение вагонов пассажирами и багажом
        train.cars.get(0).setPassengerCount(80);
        train.cars.get(0).setLuggageCount(10);
        train.cars.get(1).setPassengerCount(60);
        train.cars.get(1).setLuggageCount(5);
        train.cars.get(2).setLuggageCount(30);
        train.cars.get(3).setPassengerCount(40);
        train.cars.get(3).setLuggageCount(2);

        // Вывод информации о поезде
        train.printTrainInfo();

        // Сортировка вагонов по уровню комфорта
        train.sortCarsByComfort();
        System.out.println("\nВагоны после сортировки по уровню комфорта:");
        train.printTrainInfo();

        // Поиск вагонов с заданным количеством пассажиров
        List<TrainCar> foundCars = train.findCarsByPassengerRange(50, 80);
        System.out.println("\nВагоны с количеством пассажиров от 50 до 80:");
        for (TrainCar car : foundCars) {
            System.out.println(car);
        }
    }
}