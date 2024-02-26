package patterns.creational.builder.example1.cars;

import lombok.Getter;
import lombok.Setter;
import patterns.creational.builder.example1.components.Engine;
import patterns.creational.builder.example1.components.GPSNavigator;
import patterns.creational.builder.example1.components.Transmission;
import patterns.creational.builder.example1.components.TripComputer;

@Getter
public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    @Setter
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }
}
