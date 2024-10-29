package com.example.vehicle;

public class Truck extends Vehicle {
    public Truck(int engineCapacity, int manufactureYear) {
        super(engineCapacity, manufactureYear, VehicleType.TRUCK);
    }

    @Override
    public int calculateTax() {
        int yearMultiplier = getYearMultiplier(manufactureYear);
        return 16 * engineCapacity * yearMultiplier;
    }
}
