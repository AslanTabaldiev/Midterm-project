package com.example.vehicle;

public class Bus extends Vehicle {
    public Bus(int engineCapacity, int manufactureYear) {
        super(engineCapacity, manufactureYear, VehicleType.BUS);
    }

    @Override
    public int calculateTax() {
        int yearMultiplier = getYearMultiplier(manufactureYear);
        return 15 * engineCapacity * yearMultiplier;
    }
}
