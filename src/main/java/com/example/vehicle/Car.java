package com.example.vehicle;

public class Car extends Vehicle {

    public Car(int engineCapacity, int manufactureYear) {
        super(engineCapacity, manufactureYear, VehicleType.CAR);
    }


    @Override
    public int calculateTax() {
        int yearMultiplier = getYearMultiplier(manufactureYear);
        return 18 * engineCapacity * yearMultiplier;
    }
}
