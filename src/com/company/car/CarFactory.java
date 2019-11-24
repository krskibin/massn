package com.company.car;
import java.util.ArrayList;

public class CarFactory {
    CarProperty carProperties[] = new CarProperty[]{
            new CarProperty("opel", "astra", "SUV", 8.0, 1994, 1900.0),
            new CarProperty("opel", "cors", "SUV", 2.0, 1964, 1900.0),
            new CarProperty("opel", "polo", "SUV", 1.0, 1974, 1900.0),
    };

    ArrayList<Car> cars = new ArrayList<Car>();

    public ArrayList<Car> getCars() {

        for (CarProperty property: this.carProperties) {
            this.cars.add(new Car(property));
        }

        return this.cars;
    }
}
