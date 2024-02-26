package patterns.creational.builder.example1.builders;

import patterns.creational.builder.example1.cars.CarType;
import patterns.creational.builder.example1.components.Engine;
import patterns.creational.builder.example1.components.GPSNavigator;
import patterns.creational.builder.example1.components.Transmission;
import patterns.creational.builder.example1.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
