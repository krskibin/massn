package com.company.car;

import java.util.ArrayList;

public class Car {
    String brand;
    String model;
    String bodyType;
    Double engineCapacity;
    Integer productionYear;
    Double price;

    public Car(CarProperty cp) {
        this.brand = cp.brand;
        this.model = cp.model;
        this.bodyType = cp.bodyType;
        this.engineCapacity = cp.engineCapacity;
        this.productionYear = cp.productionYear;
        this.price = cp.price;
    }

}

class CarProperty {
    String brand;
    String model;
    String bodyType;
    Double engineCapacity;
    Integer productionYear;
    Double price;

    public CarProperty(String brand, String model,
                       String bodyType, double engineCapacity,
                       Integer productionYear, double price) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.engineCapacity = engineCapacity;
        this.productionYear = productionYear;
        this.price = price;
    }


}

