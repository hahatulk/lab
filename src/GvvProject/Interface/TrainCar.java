package GvvProject.Interface;

public interface TrainCar {
    int getCapacity();
    int getPassengerCount();
    void setPassengerCount(int passengerCount);
    int getLuggageCount();
    void setLuggageCount(int luggageCount);
    int getComfortLevel();
    String getType();
    int getSortKey();
}
